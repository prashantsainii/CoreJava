package prashant.FunctionalProgramming;

public class LamdaExpressionDemo {
    public static void main(String[] args) {

        // Implementation of sayHello function is stored in h1, which can be shared
        Hello h1 = () -> System.out.println("Say Hello");

        h1.sayHello();  // Method 1
        process(h1);    // Method 2

    }

    public static void process(Hello h) {
        h.sayHello();
    }
}
