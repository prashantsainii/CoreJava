package prashant.MultiThreading.ThreadClass;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main execution start : " + Thread.currentThread().getName());

        MyThreadClass myThreadClass = new MyThreadClass();

        // calling the start() of Thread class
        // -> that will create a new thread
        // -> In the new thread, JVM calls your overridden run() method
        // -> new thread starts executing MyThreadClass.run() independently.
        myThreadClass.start();

        System.out.println("Main execution finished : " + Thread.currentThread().getName());

    }
}
