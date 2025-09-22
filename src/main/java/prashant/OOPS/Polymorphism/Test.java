package prashant.OOPS.Polymorphism;

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }

    void show2() {
        System.out.println("Parent method 2");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child static method");
    }

    void show2() {
        System.out.println("Child method 2");
    }
}

public class Test {
    public static void main(String[] args) {

        // left side - decide what can be accessed
        // right side - decides what will be accessed

//        Static methods are class-level methods, not tied to an object.
//
//        So the compiler says:
//        “Since p is a Parent reference, I’ll bind show() to Parent.show() right now (compile time).”

        Parent p = new Child();

        // this called as method hiding
        p.show(); // Output: Parent static method

        // this is called as method overriding
        p.show2(); // Output: Child method 2
    }
}
