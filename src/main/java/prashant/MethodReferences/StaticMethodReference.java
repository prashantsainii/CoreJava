package prashant.MethodReferences;

// A method reference is a compact, readable shorthand for a lambda that
// simply calls an existing method. It refers to a method by name and lets
// the compiler create the appropriate functional interface instance. Method
// references are type-safe and are converted to lambdas

// Reference to a static method

public class StaticMethodReference {
    public static void main(String[] args) {

//        Instead of creating a lambda expression to implement same functionality again
//         we can use the already present static function via method referencing
//        ArithematicOperation arithmeticOperation = (a, b) -> {
//            int sum = a + b;
//            System.out.println(sum);
//            return sum;
//        };
//        arithmeticOperation.performOperation(2,3);

        // Functionality achieved(for static method) in simplified way
        ArithematicOperation methodReference = StaticMethodReference::performAddition;
        methodReference.performOperation(2, 3);
    }

    // static method from which I want to create my lambda expression
    public static int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
