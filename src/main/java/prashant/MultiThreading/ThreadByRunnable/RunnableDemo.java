package prashant.MultiThreading.ThreadByRunnable;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run method of RunnableDemo : " + Thread.currentThread().getName());
    }
}
