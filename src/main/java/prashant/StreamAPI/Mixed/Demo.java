package prashant.StreamAPI.Mixed;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        List<Integer> listWithDup = Arrays.asList(1,1,3,3,4,4,4,4,2,2,2);
//
//        // Max Number
//        Optional<Integer> maxNum = numbers.stream().max(Integer::compare);
//
//        // Min Number
//        Optional<Integer> minNum = numbers.stream().min(Integer::compare);
//
//        // Summation
//        int totalSum = numbers.stream().mapToInt(Integer::intValue).sum();
//
//        // Remove duplicates
//        List<Integer> uniqueList = listWithDup.stream().distinct().toList();
//
//
//
//        System.out.println(maxNum.get());
//        System.out.println(minNum.get());
//        System.out.println(totalSum);
//        System.out.println(uniqueList);



        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8,9,9);
        List<Integer> listDesc = Arrays.asList(9,8,7,6,5,4,3,2,1);
        List<String> listStr = Arrays.asList("Prashant", "Prashu", "Sainii", "Prakhar", "Jauhari");
        List<List<String>> listOfListStr = Arrays.asList(
                                            Arrays.asList("Prashant", "Saini"),
                                            Arrays.asList("Hello", "World"),
                                            Arrays.asList("Current", "Next")
                                            );

        // Find even number
//        List<Integer> evenNumbers = list.stream().filter(n->n%2 == 0).toList();
//        System.out.println(evenNumbers);
//        list.stream().filter(n->n%2==0).forEach(System.out::println);


        // Find max number
//        int maxInList = list.stream()
//                .max(Integer::compare) // it will give optional
//                .orElseThrow();        // if list is null we get exception, otherwise max number
//        System.out.println(maxInList);


        // Sort the list in ascending order
//        List<Integer> sortedList = listDesc.stream().sorted().toList();
//        System.out.println(sortedList);
//        listDesc.stream().sorted().forEach(System.out::println);


        // Sort the list in descending order
//        List<Integer> descSortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(descSortedList);
//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        // Count Strings with Specific Prefix
//        long count = listStr.stream().filter(str -> str.startsWith("Pra")).count();
//        System.out.println(count);



        // Convert List of Strings to Uppercase
//        List<String> upperCaseStr = listStr.stream().map(String::toUpperCase).toList();
//        System.out.println(upperCaseStr);


        // Sum of Numbers in a List
//        double totalSum = list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(totalSum);

        // Average of Numbers in a List
//        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);
//        System.out.println(average);


        // Check if Any String Matches a Condition
//        boolean res = listStr.stream().anyMatch(str->str.contains("Pra"));
//        System.out.println(res);


        // Find Duplicate Elements in a List
//        Set<Integer> set = new HashSet<>();
//        List<Integer> duplicates = list.stream()
//                                    .filter(s -> !set.add(s))
//                                    .toList();
//        System.out.println(duplicates);


        // Group Strings by Length
//        Map<Integer, List<String>> groupByLength = listStr.stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println(groupByLength);


        // Flatten list of list
//        List<String> flatList = listOfListStr.stream()
//                                .flatMap(List::stream)
//                                .toList();
//        System.out.println(flatList);

        // Concatenate Strings
        String concatStr = listStr.stream().collect(Collectors.joining(" "));
        System.out.println(concatStr);





















    }
}
