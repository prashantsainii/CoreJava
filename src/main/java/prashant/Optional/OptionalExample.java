package prashant.Optional;

import java.util.Optional;

public class OptionalExample {

    // Method returning Optional
    public static Optional<String> findUserNameById(int id) {
        if (id == 1) {
            return Optional.of("Prashant");
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        // Example 1: Value present
        Optional<String> name1 = findUserNameById(1);
        System.out.println(name1.orElse("Guest")); // Output: Prashant

        // Example 2: Value absent
        Optional<String> name2 = findUserNameById(2);
        System.out.println(name2.orElse("Guest")); // Output: Guest

        // Example 3: Using ifPresent()
        name1.ifPresent(n -> System.out.println("Found user: " + n));   // Prints "Found user: Prashant"
        name2.ifPresent(n -> System.out.println("Found user: " + n));   // Won’t print anything
    }
}
