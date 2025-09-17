package prashant.InterviewTopics.DifferentiateBtw.InstanceVsStatic;

class Employee {
    int id;                // instance variable
    String name;           // instance variable - Created when object is created
    static String company = "Capgemini"; // static variable - Created when class is loaded in JVM
}

public class InstanceVsStaticDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println(e1.company); // Capgemini
        System.out.println(e2.company); // Capgemini

        Employee.company = "Google";            // change via class
        System.out.println(Employee.company);
        System.out.println(e1.company);         // Google (reflected in all objects)
    }
}
