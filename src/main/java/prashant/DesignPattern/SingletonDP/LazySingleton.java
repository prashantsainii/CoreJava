package prashant.DesignPattern.SingletonDP;

// Lazy way of creating the object
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {

    }

    // static - so that we don't need an object to call this method.
    // not thread safe - 2 threads can create 2 objects at same time
    public static LazySingleton getSingletonInstance() {
        if(singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
