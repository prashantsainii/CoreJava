package prashant.StreamAPI.Mixed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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



        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,9);
        List<Integer> listDesc = Arrays.asList(9,8,7,6,5,4,3,2,1);
        List<String> listStr = Arrays.asList("Prashant", "Prashu", "Saini", "Prakhar", "Jauhari");

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
//        long totalSum = list.stream().sum();



















    }
}
