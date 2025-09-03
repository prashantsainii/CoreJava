package prashant.FunctionalProgramming.FI.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));

        Predicate<Integer> isGreaterThan50 = n -> n > 50;
        System.out.println(isGreaterThan50.test(65));

        boolean evenAndGreater = isEven.or(isGreaterThan50).test(20);
        System.out.println(evenAndGreater);


        Predicate<Integer> isLessThan100 = n -> n < 100;
        boolean res1 = isEven.and(isGreaterThan50).and(isLessThan100).test(70);
        System.out.println(res1);

        // negate is applied in the order it is written in expression
        // negate is applied on isEven
        boolean res2 = isEven.negate().or(isGreaterThan50).test(60);
        System.out.println(res2);

        // negate works after the evaluating both (isEven or isGreaterThan50)
        boolean res3 = isEven.or(isGreaterThan50).negate().test(61);
        System.out.println(res3);

        Predicate<Integer> isOdd1 = isEven.negate();    // negate is used only on not null predicate
        Predicate<Integer> isOdd2 = Predicate.not(isEven); // null safe

        System.out.println(isOdd1.test(41));
        System.out.println(isOdd2.test(41));

        Predicate<String> checkEquality = Predicate.isEqual("Eazy Bytes");
        System.out.println(checkEquality.test("Eazy Bytes"));


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList);

    }
}
