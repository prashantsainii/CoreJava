package prashant.StreamAPI.Mixed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> listWithDup = Arrays.asList(1,1,3,3,4,4,4,4,2,2,2);

        // Max Number
        Optional<Integer> maxNum = numbers.stream().max(Integer::compare);

        // Min Number
        Optional<Integer> minNum = numbers.stream().min(Integer::compare);

        // Summation
        int totalSum = numbers.stream().mapToInt(Integer::intValue).sum();

        // Remove duplicates
        List<Integer> uniqueList = listWithDup.stream().distinct().toList();



        System.out.println(maxNum.get());
        System.out.println(minNum.get());
        System.out.println(totalSum);
        System.out.println(uniqueList);
    }
}
