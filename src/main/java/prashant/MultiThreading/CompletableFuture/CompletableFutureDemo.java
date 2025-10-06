package prashant.MultiThreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Thread starting : " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("Thread completed : " + Thread.currentThread().getName());
                return "Result 1 completed. -> ";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        CompletableFuture<String> result2 = cf.thenApplyAsync((result1) -> {
            System.out.println("Thread starting on result 2: " + Thread.currentThread().getName());
            return result1 + "Result 2 completed -> ";

        });

        System.out.println(result2.get());


        // difference between thenApply and thenCompose

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<CompletableFuture<String>> cf2 = cf1.thenApply((res1) ->
            CompletableFuture.supplyAsync(() -> res1 + " world")
        );

        CompletableFuture<String> cf3 = cf1.thenCompose((res1) ->
                CompletableFuture.supplyAsync(() -> res1 + " world")
        );

        System.out.println("thenApply result   : " + cf2.get().get()); // double get
        System.out.println("thenCompose result : " + cf3.get());       // single get

    }
}
