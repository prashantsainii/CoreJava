package prashant.StreamAPI.Mixed;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        List<Integer> listWithDup = Arrays.asList(1,1,3,3,4,4,4,4,2,2,2);
//
//        // Max Number
        Optional<Integer> maxNum = numbers.stream().max(Integer::compare);
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
        List<String> listStrWithNull = Arrays.asList("Prashant", "Prashu", null,  "Sainii", "Prakhar", "Jauhari", null);
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
//        String concatStr = listStr.stream().collect(Collectors.joining(" "));
//        System.out.println(concatStr);

        // Create a custom collector to join strings with a delimiter.
        String joinedStr = listStr.stream().collect(Collectors.joining(", "));


        // Find Nth Largest Element in a List
        int findThisLargest = 3;
        int nthLargest = list.stream()
                .sorted()
                .distinct()
                .skip(findThisLargest)
                .findFirst()
                .orElseThrow();
        System.out.println(nthLargest);


        // Remove Duplicates Without Collectors
        List<Integer> uniqueList = list.stream()
                .distinct()
                .toList();
        System.out.println(uniqueList);

        // Skip the first 3 elements and limit the result to the next 2.
        List<Integer> skippedLimit = list.stream()
                .skip(3)
                .limit(2)
                .toList();
        System.out.println(skippedLimit);

        // Calculate the Product of All Numbers
        int product = list.stream()
                .reduce(1, (a,b) -> a*b);
        System.out.println(product);

//        Ans1 : yes beacause main thread is responsible for printing Hello from main, where as Hello from thread will be handled by another thread
//        Ans2 : numbers will not be in the order beacuse both trread will start the execution at same time, so we cannot say for sure that numbers will be in order,

    }
}
