package prashant.Zemp;

class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }
}
public class Test {
    public static void main(String[] args) {
        int b = 10;

        if(b == 10) {
            throw new MyRuntimeException("Value of b is 10");
        }
    }
}