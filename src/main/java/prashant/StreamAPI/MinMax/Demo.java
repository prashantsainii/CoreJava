package prashant.StreamAPI.MinMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {


        List<String> listStr = Arrays.asList("Prashant", "Prashu", "Sainii", "Prakhar", "Jauhari");
        String sentence = "Java Stream API is very powerful";

        // Find the Longest String
        String longestWord = listStr.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longestWord);

        // Find the Longest Word from a Sentence
        String longest = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);




    }
}
