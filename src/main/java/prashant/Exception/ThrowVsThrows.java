package prashant.Exception;

import java.io.IOException;

class Parent {
    public static void sub(int a, int b) {
        if(b == 0) {
            System.out.println("Some Error");
            throw new IndexOutOfBoundsException(); // throwing unchecked exception
//            throw new IOException(); // for doing this we will have to add throws in method signature, because IOException is a checked exception
        }
    }
}

public class ThrowVsThrows {
    public static void main(String[] args) throws Exception{
//        Parent.sub(3,0);    // either bypass the error to Parent class i.e. Object class by adding throws Exception in method definition

        // or handle the error with the try catch block
        try {
            Parent.sub(3,0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
