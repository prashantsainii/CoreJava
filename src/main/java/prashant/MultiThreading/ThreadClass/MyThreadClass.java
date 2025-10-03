package prashant.MultiThreading.ThreadClass;

public class MyThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Run method od MyThreadClass : " + Thread.currentThread().getName());
    }
}
