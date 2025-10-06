package prashant.MultiThreading.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<String>> jobResults = new ArrayList<>();

        // Submit 6 jobs
        for (int i = 1; i <= 6; i++) {
            Job job = new Job("Job-" + i);
            Future<String> future = executor.submit(job); // submit returns a Future
            jobResults.add(future);
        }

        executor.shutdown(); // stop accepting new jobs

        // Collect results
        for (Future<String> future : jobResults) {
            String result = future.get(); // wait for job to finish and get result
            System.out.println("Collected Result: " + result);
        }
    }
}
