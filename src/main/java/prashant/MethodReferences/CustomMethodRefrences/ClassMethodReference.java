package prashant.MethodReferences.CustomMethodRefrences;

import java.util.List;

// Reference to an instance method of an arbitrary object of a particular type

public class ClassMethodReference {
    public static void main(String[] args) {

        var list = List.of("IT", "Sales", "HR", "Marketing", "Finance");

        list.stream()
                .map(String::toLowerCase)  // String method reference
                .forEach(System.out::println);  // System.out is a particular object (PrintStream)

    }

}
