package prashant.MultiThreading.Future;

import java.util.concurrent.*;

public class RunnableDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);

        Runnable task = () -> {
            try {
                System.out.println("Thread is starting the execution");
                Thread.sleep(3000);
                System.out.println("Thread completed the execution");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Future<?> future = executor.submit(task);
        executor.shutdown();

        System.out.println("Task is done : " + future.isDone());

        try {
            future.get();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Task is done : " + future.isDone());
        System.out.println("Task is cancelled : " + future.isCancelled());

    }
}
