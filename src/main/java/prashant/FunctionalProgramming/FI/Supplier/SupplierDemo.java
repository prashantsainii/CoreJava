package prashant.FunctionalProgramming.FI.Supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

//        Supplier is used when we want to generate or fetch a value without any
//        input. For example, creating objects lazily or generating random values

        Supplier<Integer> getDate = () -> LocalDate.now().getDayOfMonth();
        System.out.println("Today's Date is : " + getDate.get());

        Supplier<Integer> getMonthNum = () -> LocalDate.now().getMonthValue();
        System.out.println("Current Month Number : " + getMonthNum.get());

        Supplier<String> getMonthName = () -> LocalDate.now().getMonth().name();
        System.out.println("Current Month Name : " + getMonthName.get());

        Supplier<String> getDayName = () -> LocalDate.now().getDayOfWeek().name();
        System.out.println("Today's day is : " + getDayName.get());

        Supplier<Integer> getYearNumber = () -> LocalDate.now().getYear();
        System.out.println("Current year is : " + getYearNumber.get());
    }
}
