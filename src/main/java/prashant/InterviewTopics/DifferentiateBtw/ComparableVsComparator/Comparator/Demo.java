package prashant.InterviewTopics.DifferentiateBtw.ComparableVsComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "A"));
        list.add(new Student(3, "C"));
        list.add(new Student(1, "B"));

        Collections.sort(list, Student.nameComparator);
        Collections.sort(list, Student.idComparator);

        list.forEach(item -> System.out.println(item.id));

    }
}
