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

        System.out.println(Employee.company); // Capgemini
        System.out.println(e2.company); // Capgemini

        Employee.company = "Google";            // change via class
        e1.company = "Amazon";                  // change via object

        System.out.println(Employee.company);
        System.out.println(e1.company);         // Amazon (reflected in all objects)
        System.out.println(e2.company);
    }
}
