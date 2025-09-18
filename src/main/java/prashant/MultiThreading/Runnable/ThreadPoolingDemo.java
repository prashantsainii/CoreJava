package prashant.MultiThreading.Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolingDemo {
    public static void main(String[] args) {
        // Thread pool with 3 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 6 jobs
        for (int i = 1; i <= 6; i++) {
            Job job = new Job("Job-" + i);
            executor.submit(job);  // puts the job into the pool’s queue
        }

        executor.shutdown(); // stop accepting new jobs
    }
}