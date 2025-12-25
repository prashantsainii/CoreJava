package prashant.Exception;


class MyCheckedException extends Exception {     // extend Exception for Checked Exceptions
    public MyCheckedException(String message) {
        super(message);
    }
}

public class CustomCheckedException {
    public static void main(String[] args)  {
        int a = 5;
        try {
            if(a == 5) {    // Best Practice - checked exceptions are handled using try-catch instead of throwing from main.
                throw new MyCheckedException("Value of a is 5");
            }
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }
}

/*
    Compile Time (Handled by Compiler)

    The Java compiler checks:
        -> If a method throws a checked exception
        -> Whether it is:
            ~ handled using try-catch, OR
            ~ declared using throws

    If not → Compilation error

*/


