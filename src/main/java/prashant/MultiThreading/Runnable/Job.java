package prashant.MultiThreading.Runnable;

class Job implements Runnable {
    private final String jobName;  // Name of the job (immutable)

    public Job(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing job: " + jobName);
        try {
            Thread.sleep(2000);  // simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished job: " + jobName);
    }
}