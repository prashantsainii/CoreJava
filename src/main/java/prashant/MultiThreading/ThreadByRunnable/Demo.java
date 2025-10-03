package prashant.MultiThreading.ThreadByRunnable;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Start in main method : " + Thread.currentThread().getName());
        RunnableDemo runnableDemo = new RunnableDemo();

        // This will set runnableDemo as runnable object
        Thread thread = new Thread(runnableDemo);

        /*
        Thread thread1 = new Thread(() -> System.out.println("Inside run method of RunnableDemo : " + Thread.currentThread().getName()));

        Above 2 thread creation lines are essentially doing the same thing,

        The lambda () -> ... is actually syntactic sugar.
        The compiler turns it into an anonymous implementation of Runnable.

        Behind the scenes, the compiler does something equivalent to:

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run method of RunnableDemo : " + Thread.currentThread().getName());
            }
        });

        The Thread constructor stores it in its target field:
        public Thread(Runnable target) {
            this.target = target;
        }

         */


        // Following line will call start() of Thread
        // -> that will create a new thread
        // -> JVM ensures that when the new thread starts, it executes run() of Thread
        // -> run() of Thread will check whether runnable object is null or not
        // -> if it's not null, it will call run() of runnable object(runnableDemo)
        // -> if its null, it will do nothing

        // IMP -> only start() of Thread will start new thread,
        // directly calling run() of Thread will continue the execution in same thread

        thread.start();

        System.out.println("Finish in main method : " + Thread.currentThread().getName());

    }
}
