package prashant.OOPS.Inheritance;

public class Child extends Parent{

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

//    @Override    // here overriding is not happening and greet method of child is independent of parent greet method
    static void greet() {
        System.out.println("greet child");
    }



}
