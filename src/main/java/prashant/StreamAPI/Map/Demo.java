package prashant.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8,9,9);
        List<String> names = Arrays.asList("Prashant", "Ayush", "Shubham", "Divyansh", "Abhishek");

        List<String> listStr = Arrays.asList("Prashant", "Prashu", "Sainii", "Prakhar", "Jauhari");

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





        // Parallel Stream to Compute Sum
        int sum = list.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        // Calculate Average of Numbers
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(average);


        // Find the Sum of Squares of Even Numbers
        int sumOfEvenSquares = list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n*n)
                .sum();
        System.out.println(sumOfEvenSquares);

        // Reverse Each String in a List
        List<String> ans = names.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .toList();
        System.out.println(ans);

        String str = "TemporaryString";
        // Find the Most Frequent Character in a String
        Character maxChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();
        System.out.println(maxChar);

// ________________________________________________________________________


        // Find First Non-Repeated Character in a String
        Character ch = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .orElseThrow();

    }
}

