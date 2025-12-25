package prashant.OOPS.Inheritance;

class Parent {

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

//        @Override     // static parent class method do not override
    static void greet2() {
        System.out.println("Greet in parent");
    }
}

class Child extends Parent{

    int childAge;
    String childName;

    public Child(int parentAge, int childAge, String childName) {
        super(parentAge);
        this.childAge = childAge;
        this.childName = childName;
    }

    @Override
    void fun() {
        System.out.println("fun child");
    }

//    @Override   // static method of parent class cannot be overridden
//    void greet() {
//        System.out.println("Greet in child");
//    }

//        @Override    // here overriding is not happening and greet method of child is independent of parent greet method
    static void greet() {
        System.out.println("greet child");
    }



}
public class Main {
    public static void main(String[] args) {

        Parent p = new Parent(50);
        Child c = new Child(50, 20, "Golu");

        Parent pc = new Child(40, 10, "Molu");

        pc.greet();   //this will call greet method of parent not of child

        pc.fun();
    }
}
