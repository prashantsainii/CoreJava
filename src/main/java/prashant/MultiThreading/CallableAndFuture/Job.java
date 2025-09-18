package prashant.MultiThreading.CallableAndFuture;

import java.util.concurrent.Callable;

class Job implements Callable<String> {

    private final String jobName;   // private -> Outsiders can’t mess with it directly AND final -> Once assigned, it never changes

    public Job(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is processing: " + jobName);
        try {
            Thread.sleep(2000); // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = jobName + " done!";
        System.out.println(Thread.currentThread().getName() + " finished: " + jobName);
        return result; // return result of this job
    }
}
