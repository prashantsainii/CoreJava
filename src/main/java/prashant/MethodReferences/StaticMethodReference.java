package prashant.MethodReferences;

public class StaticMethodReference {
    public static void main(String[] args) {

//        Instead of creating a lambd expression to implement same functionality again
//         we can use the already present static function via method referencing
//        ArithematicOperation arithematicOperation = (a, b) -> {
//            int sum = a + b;
//            System.out.println(sum);
//            return sum;
//        };
//        arithematicOperation.performOperation(2,3);

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
