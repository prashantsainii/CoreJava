package prashant.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> names = Arrays.asList("Prashant", "Ayush", "Shubham", "Divyansh", "Abhishek");

        // Square of all numbers
        List<Integer> squares = numbers.stream()
                                .map(n -> n*n)
                                .toList();      // immutable, java 8+

        // Names to upper case
        List<String> upperCaseNames = names.stream()
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());   // mutable, java 16+


        // Get length of each name
        List<Integer> namesLength = names.stream()
                                    .map(name -> name.length())
                                    .toList();


        // Numbers to there string format
        List<String> stringNumbers = numbers.stream()
                                    .map(num -> String.valueOf(num))
                                    .toList();

        System.out.println(squares);
        System.out.println(upperCaseNames);
        System.out.println(namesLength);
        System.out.println(stringNumbers);



        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Prashant", "Saini"),
                Arrays.asList("Noida", "Bengaluru")
        );

        List<String> flatList = listOfList.stream()
                                .flatMap(List::stream)   // flatten List<List<String>> → Stream<String>
                                .toList();

        System.out.println(flatList);
    }
}

