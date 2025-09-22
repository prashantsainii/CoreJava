package prashant.MethodReferences;

import java.util.function.Consumer;

// Reference to a Static Method

public class StaticMethodRef {
    public static void main(String[] args) {

        Consumer<String> consumer = StaticMethodRef::printMessage; // static method reference
        consumer.accept("Hello from static method reference!");
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
    }
}
