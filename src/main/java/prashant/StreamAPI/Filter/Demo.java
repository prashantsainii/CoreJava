package prashant.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> names = Arrays.asList("Prashant", "Ayush", "Shubham", "Divyansh", "Abhishek");

        // Even Numbers
        List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> n%2 == 0)
                                    .collect(Collectors.toList());

        // Length > 7
        List<String> lengthyNames = names.stream()
                                    .filter(name -> name.length() > 7)
                                    .collect(Collectors.toList());

        // First element greater than 4
        Optional<Integer> first = numbers.stream()
                                  .filter(n -> n > 4)
                                  .findFirst();

        // Min element greater than 4
        Optional<Integer> smallestGreaterThan4 = numbers.stream()
                                   .filter(n -> n > 4)
                                   .min(Integer::compareTo);

        // Count of elements > 3
        long count = numbers.stream().filter(n -> n>3).count();


        System.out.println("List of even numbers : " + evenNumbers);
        System.out.println("Lengthy names : " + lengthyNames);
        System.out.println("First element greater than 4 : " + first);
        System.out.println("Smallest element greater than 4 : " + smallestGreaterThan4.get());
        System.out.println("Count of element greater than 3 : " + count);

        // For directly printing the result
//        names.stream()
//                .filter(name -> name.length() > 5)
//                .forEach(System.out::println);
    }
}
