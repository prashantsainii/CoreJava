package prashant.Zemp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Student created");
    }
}

public class Test {
    public static void main(String[] args) {

        Supplier<Student> supplier = Student::new;

        Student s1 = supplier.get();

    }
}