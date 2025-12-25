package prashant.InterviewTopics.DifferentiateBtw.ComparableVsComparator.Comparator;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "B"));
        list.add(new Student(2, "A"));
        list.add(new Student(3, "C"));

        Comparator<Student> comp = (stdObj1, stdObj2) -> stdObj1.name.compareTo(stdObj2.name);

        Collections.sort(list, Student.nameComparator);     // comparator in class
        Collections.sort(list, Student.idComparator);
        Collections.sort(list, Comparator.comparing(stdObj -> stdObj.name));    // direct
        Collections.sort(list, (stdObj1, stdObj2) -> stdObj1.name.compareTo(stdObj2.name));
        Collections.sort(list, (stdObj1, stdObj2) -> stdObj1.id - stdObj2.id);
//        Collections.sort(list, comp);

        list.forEach(item -> System.out.println(item.name));

    }
}
