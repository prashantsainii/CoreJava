package prashant.DesignPattern.SingletonDP;

public class SynchronizedSingleton {
    private static SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton() {

    }

    // Only one thread can execute this at a time.
    // The main disadvantage of this method is that using synchronized
    // every time while creating the singleton object is expensive and
    // may decrease the performance of your program.
    public synchronized static SynchronizedSingleton getSynchronizedSingleton() {
        if(synchronizedSingleton == null) {
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
}
