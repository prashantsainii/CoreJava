package prashant.Run;

class Student {
    int id;           // numeric -> default 0
    String name;      // reference -> default null
    boolean active;   // boolean -> default false
    double marks;     // numeric -> default 0.0

//    final int nums;


    void display() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("active = " + active);
        System.out.println("marks = " + marks);
    }
}

public class DefaultValueExample {
    public static void main(String[] args) {

        final int num;

        num = 10;

        Student s = new Student(); // default constructor
        s.display();
    }
}
