package prashant.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> names = Arrays.asList("Prashant", "Ayush", "Shubham", "Divyansh", "Abhishek");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8,9,9);
        List<Integer> anotherList = Arrays.asList(1,2,5,6,8);
        List<String> listStrWithNull = Arrays.asList("Prashant", "Prashu", null,  "Sainii", "Prakhar", "Jauhari", null);

        // Even Numbers
        List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> n%2 == 0)
                                    .collect(Collectors.toList());

        // Length > 7
        List<String> lengthyNames = names.stream()
                                    .filter(name -> name.length() > 7)
                                    .collect(Collectors.toList());

        // First element greater than 4
        long first = numbers.stream()
                                  .filter(n -> n > 4)
                                  .findFirst()
                                  .orElseThrow();


        // Min element greater than 4
        Optional<Integer> smallestGreaterThan4 = numbers.stream()
                                   .filter(n -> n > 4)
                                   .min(Integer::compare);

        // Count of elements > 3
        long count = numbers.stream()
                .filter(n -> n>3)
                .count();

        // Remove Null Values
        List<String> listWithNotNull = listStrWithNull.stream()
                .filter(Objects::nonNull)
                .toList();
        System.out.println(listWithNotNull);


        // Find Common Elements Between Two Lists
        List<Integer> commonList = list.stream()
                .filter(anotherList::contains)
                .toList();
        System.out.println(commonList);

        // Count Strings with Specific Prefix
        long count1 = names.stream()
                .filter(str -> str.startsWith("Pra"))
                .count();
        System.out.println(count1);

        // Find All Palindromic Strings
        List<String> palindromes = names.stream()
                .filter(str -> str.equals(new StringBuilder(str).reverse().toString()))
                .toList();
    }
}
