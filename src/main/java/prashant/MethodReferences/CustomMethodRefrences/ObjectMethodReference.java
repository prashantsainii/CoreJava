package prashant.MethodReferences.CustomMethodRefrences;

// Reference to an instance method of a particular object

public class ObjectMethodReference {
    public static void main(String[] args) {

        ObjectMethodReference instanceMethodReference = new ObjectMethodReference();
        ArithematicOperation methodReference = instanceMethodReference::performAddition;
        methodReference.performOperation(2, 3);
    }

    public int performAddition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
}
