package prashant.MultiThreading.Future;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Callable task returning a String
        Callable<String> task = () -> {
            System.out.println("Thread is starting the execution");
            Thread.sleep(3000); // simulate work
            System.out.println("Thread completed the execution");
            return "Wow ! Task Result";
        };

        Future<String> future = executor.submit(task);
        executor.shutdown();

        System.out.println("Task is done: " + future.isDone());

        try {
            // Wait for the task to complete and get the result
            String result = future.get();
            System.out.println("Task result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Task is done: " + future.isDone());
        System.out.println("Task is cancelled: " + future.isCancelled());
    }
}
