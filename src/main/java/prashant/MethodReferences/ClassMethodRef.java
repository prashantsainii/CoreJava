package prashant.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class ClassMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prashant", "Saini", "Bangalore");

        // Instead of using (s -> s.toUpperCase())
        names.stream()
                .map(String::toUpperCase)   // String method reference
                .forEach(System.out::println);  // System.out is a particular object (PrintStream)
    }
}
