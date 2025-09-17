package prashant.MethodReferences;

// Reference to an instance method of a particular object

public class InstanceMethodReference {
    public static void main(String[] args) {

        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        ArithematicOperation methodReference = instanceMethodReference::performAddition;
        methodReference.performOperation(2, 3);
    }

    public int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
