package prashant.InterviewTopics.EqualsMethod;

public class TestEquals {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Prashant");
        Student s2 = new Student(1, "Prashant");

        // .equals() will give false and acts same as '=='
        // until we Override the equals method in the Student class
        System.out.println(s1.equals(s2));

        // This is not true in case of String, because String class overrides equals() method
    }
}
