package prashant.Exception;

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) throws MyException {
        int a = 5;
        if(a == 5) {
            throw new MyException("Value of a is 5");
        }
    }
}
