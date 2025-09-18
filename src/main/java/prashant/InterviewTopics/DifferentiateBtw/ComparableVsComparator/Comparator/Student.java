package prashant.InterviewTopics.DifferentiateBtw.ComparableVsComparator.Comparator;

import java.util.Comparator;

// Comparator : Defines an external/custom ordering of objects.

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Comparator for sorting by name
    public static Comparator<Student> nameComparator =
            Comparator.comparing(s -> s.name);

    // Comparator for sorting by id
    public static Comparator<Student> idComparator =
            Comparator.comparingInt(s -> s.id);

}
