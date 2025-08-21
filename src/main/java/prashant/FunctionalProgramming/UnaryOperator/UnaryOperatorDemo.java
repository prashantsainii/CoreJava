package prashant.FunctionalProgramming.UnaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {

//        UnaryOperator is used when input type is same as output type apart from that
//        there is no difference between Function and UnaryOperator Interface

        UnaryOperator<String> convertStr = str -> str.toUpperCase();
        System.out.println(convertStr.apply("Prashant Saini"));

        // when you want to return the same value
        UnaryOperator<String> sameValue = UnaryOperator.identity();
        System.out.println(sameValue.apply("Prashant Saini"));

        UnaryOperator<Integer> doubleValue = n -> n*2;
        UnaryOperator<Integer> addThree = n -> n + 3;

        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);// left to right evaluation
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);// right to left evaluation

        System.out.println(output1.apply(5));
        System.out.println(output2.apply(5));
    }
}
