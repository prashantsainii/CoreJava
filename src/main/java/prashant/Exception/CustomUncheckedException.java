package prashant.Exception;

class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
public class CustomUncheckedException {
    public static void main(String[] args) {
        int a = 10;
        // We don't need to handle Unchecked Exception by try catch block or throws
        // writing throws is redundant - RuntimeException and its subclasses are not checked at compile time
        // writing try catch is optional
        if(a == 10) {
            throw new MyUncheckedException("Value of a is 10");
        }
    }
}
