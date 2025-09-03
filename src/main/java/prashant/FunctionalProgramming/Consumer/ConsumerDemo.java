package prashant.FunctionalProgramming.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("Prashant Saini");

        Consumer<Integer> squareOf = num -> System.out.println(num*num);
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        numList.forEach(squareOf);

        Consumer<String> appendInput = input -> System.out.println("New Value after appending : HELLO " + input);
//        appendInput.andThen(convertAndDisplay).accept("lambda expression");
        appendInput.accept("lambda expression");
        convertAndDisplay.accept("lambda expression");
        System.out.println();
        appendInput.andThen(convertAndDisplay).accept("lambda expression");
        System.out.println();
        convertAndDisplay.andThen(appendInput).accept("lambda expression");
    }
}
