package prashant.MethodReferences;

import java.util.function.Supplier;

// Reference to a Constructor

class Student {
    public Student() {
        System.out.println("Student created!");
    }
}

public class ConstructorMethodRef {
    public static void main(String[] args) {
        Supplier<Student> supplier = Student::new;  // constructor reference
        Student s = supplier.get();  // Output: Student created!
    }
}
