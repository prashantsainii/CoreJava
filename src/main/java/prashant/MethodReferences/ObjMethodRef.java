package prashant.MethodReferences;

import java.util.function.Supplier;

// Reference to an Instance Method of a Particular Object

public class ObjMethodRef {
    public static void main(String[] args) {
        String name = "Prashant";

        Supplier<Integer> supplier = name::length;  // instance method reference
        System.out.println(supplier.get());  // Output: 8
    }
}
