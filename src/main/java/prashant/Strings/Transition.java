package prashant.Strings;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Transition {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(9));
        System.out.println(isEven.test(10));

    }
}

