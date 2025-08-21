package prashant.OOPS.Inheritance;

public class Parent {

    int parentAge;

    public Parent(int age) {
        this.parentAge = age;
    }

    void fun() {
        System.out.println("this is fun in parent");
    }

    static void greet() {
        System.out.println("this is greet in parent");
    }

//    @Override     // static parent class method do not override
    static void greet2() {
        System.out.println("Greet in parent");
    }




}
