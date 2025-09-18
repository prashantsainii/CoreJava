package prashant.DesignPattern.SingletonDP;

public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {

    }

    public static DoubleCheckedLockingSingleton getDoubleCheckedLockingSingleton() {
        if(instance == null) {
            synchronized(DoubleCheckedLockingSingleton.class) {
                // check again as multiple thread can reach above step
                // if one has created the object, then no need to create again
                if(instance == null)
                    instance = new DoubleCheckedLockingSingleton();
            }
        }

        return instance;
    }
}
