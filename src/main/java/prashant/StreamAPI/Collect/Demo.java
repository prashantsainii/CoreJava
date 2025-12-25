package prashant.StreamAPI.Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8,9,9);
        List<Integer> anotherList = Arrays.asList(1,2,5,6,8);
        List<String> listStr = Arrays.asList("Prashant", "Prashu", "Sainii", "Prakhar", "Jauhari");
        String str = "TemporaryString";

        // Convert a list of strings into a map of string(key) and its length(value).
        Map<String, Integer> map = listStr.stream()
                .collect(Collectors.toMap(word -> word, String::length));
        System.out.println(map);

        // Partition Numbers into Even and Odd
        Map<Boolean, List<Integer>> mapOddEven = list.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(mapOddEven);

        // Count Frequency of Characters in a String
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(freqMap);


    }
}
