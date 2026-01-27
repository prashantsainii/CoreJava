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
    A checked exception - Compile Time (Handled by Compiler)
        -> Is checked at compile time
        -> Must be either:
               1. Handled using try–catch(Exception is handled gracefully)
               2. Declared using throws in the method signature(program terminates abnormally)

    Example :
        IOException
        SQLException
        FileNotFoundException
        ClassNotFoundException

*/


