package prashant.InterviewTopics.DifferentiateBtw.ComparableVsComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "A"));
        list.add(new Student(1, "B"));

//        Java will internally call the compareTo() method of your Student class
//        for comparing elements, because Student implements Comparable<Student>.

        Collections.sort(list); // uses compareTo()

    }
}
