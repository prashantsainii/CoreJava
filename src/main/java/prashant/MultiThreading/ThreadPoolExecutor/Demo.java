package prashant.MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                                            2,
                                            4,
                                            1,
                                            TimeUnit.MINUTES,
                                            new ArrayBlockingQueue<>(2),
                                            Executors.defaultThreadFactory(),
                                            new ThreadPoolExecutor.AbortPolicy());

        Runnable task = () -> {
            try {
                System.out.println("Starting execution by " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("Ending execution by " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                // handle exception
            }
        };

        for(int i=0; i<6; i++) {
            executor.submit(task);
        }

        executor.shutdown();       // stop accepting new tasks, but continues the execution of already accepted one's
    }
}
