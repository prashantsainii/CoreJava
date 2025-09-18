package prashant.Enums;


/*
*
*   enum (short for enumeration) is a special data type in Java used to
*   define a collection of constant values.
*
*   1. Type-safe constants (can’t assign other values).
*
*   2. Implicitly static and final.
*
*
*
**/
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumBasic {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today);

//         Enum has built-in methods
        for (Day d : Day.values()) {
            System.out.println(d + " at index " + d.ordinal());
        }
    }
}