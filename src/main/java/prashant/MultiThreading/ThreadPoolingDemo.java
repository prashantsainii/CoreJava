package prashant.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing task: " + taskName);
        try {
            Thread.sleep(2000);  // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished task: " + taskName);
    }
}

public class ThreadPoolingDemo {
    public static void main(String[] args) {
        // Here, executor is an ExecutorService (thread pool).
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 6 tasks
        for (int i = 1; i <= 6; i++) {
            // worker is a task (object implementing Runnable).
            WorkerThread worker = new WorkerThread("Task-" + i);
            executor.submit(worker);  // submit(worker) means: 👉 “Put this task into the thread pool’s queue so one of the available threads can pick it up and execute it.”
        }

        executor.shutdown(); // stop accepting new tasks
    }
}

//ExecutorService – Main interface to manage thread pools.

//Executors –  Utility class with factory methods:
            // newFixedThreadPool(n) – Fixed number of threads.
            // newCachedThreadPool() – Creates new threads as needed, reuses idle ones.
            // newSingleThreadExecutor() – Only one thread.
            // newScheduledThreadPool(n) – For scheduled tasks (like cron jobs).
