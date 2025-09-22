package prashant.MethodReferences.CustomMethodRefrences;

// A method reference is a compact, readable shorthand for a lambda that
// simply calls an existing method. It refers to a method by name and lets
// the compiler create the appropriate functional interface instance. Method
// references are type-safe and are converted to lambdas

// Reference to a static method

public class StaticMethodReference {
    public static void main(String[] args) {

        ArithematicOperation operation = StaticMethodReference::performAddition;
        operation.performOperation(4,5);
    }

    public static int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
