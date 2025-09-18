package prashant.DesignPattern.SingletonDP;

public class Example {
    public static void main(String[] args) {

        LazySingleton lazyInstance1 = LazySingleton.getSingletonInstance();
        System.out.println(lazyInstance1.hashCode());

        LazySingleton lazyInstance2 = LazySingleton.getSingletonInstance();
        System.out.println(lazyInstance2.hashCode());


        EagerSingleton eagerInstance1 = EagerSingleton.getEagerSingleton();
        System.out.println(eagerInstance1.hashCode());

        EagerSingleton eagerInstance2 = EagerSingleton.getEagerSingleton();
        System.out.println(eagerInstance2.hashCode());

        DoubleCheckedLockingSingleton dclInstance1 = DoubleCheckedLockingSingleton.getDoubleCheckedLockingSingleton();
        DoubleCheckedLockingSingleton dclInstance2 = DoubleCheckedLockingSingleton.getDoubleCheckedLockingSingleton();

        System.out.println(dclInstance1.hashCode());
        System.out.println(dclInstance2.hashCode());

    }
}
