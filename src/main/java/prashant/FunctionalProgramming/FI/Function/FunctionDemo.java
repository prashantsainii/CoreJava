package prashant.FunctionalProgramming.FI.Function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("Prashant Saini"));

        Function<String, Integer> getStrLength = input -> input.length();
        System.out.println(getStrLength.apply("Prashant Saini"));

        Function<String, String> sameValue = Function.identity();
        System.out.println(sameValue.apply("Prashant"));

        Function<Integer, Integer> doubleValue = n -> n*2;
        Function<Integer, Integer> addThree = n -> n + 3;
        Function<Integer, Integer> doubleFour = n -> n * 4;

        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);// left to right evaluation
        Function<Integer, Integer> output2 = doubleValue.compose(addThree).compose(doubleFour);// right to left evaluation

        System.out.println(output1.apply(5));
        System.out.println(output2.apply(5));
    }
}
