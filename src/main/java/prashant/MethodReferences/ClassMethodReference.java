package prashant.MethodReferences;

import java.util.List;

// Reference to an instance method of an arbitrary object of a particular type

public class ClassMethodReference {
    public static void main(String[] args) {
        var list = List.of("IT", "Sales", "HR", "Marketing", "Finance");

        list.forEach(department -> System.out.println(department));
        list.forEach(System.out::println);
    }
}
