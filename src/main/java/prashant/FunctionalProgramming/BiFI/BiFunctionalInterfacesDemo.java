package prashant.FunctionalProgramming.BiFI;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionalInterfacesDemo {
    public static void main(String[] args) {

        // 2 Inputs , boolean output
        BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1 + num2) % 2 == 0;
        System.out.println(isSumEven.test(5, 7));   // true

        // 2 Inputs , 1 Output
        BiFunction<Double, Double, Double> calclulatePower = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calclulatePower.apply(2.0, 3.0));

        // 2 Inputs, No Output
        BiConsumer<String, String> appendAndConvert = (word1, word2) -> System.out.println((word1 + word2).toUpperCase());
        appendAndConvert.accept("Hello ", "Prashant");

        // 2 Inputs(of same type), 1 Output (of same type)
        BinaryOperator<Double> calculatePowerWithBO = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePowerWithBO.apply(5.0, 2.0));

    }
}
