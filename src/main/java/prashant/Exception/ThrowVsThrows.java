package prashant.Exception;

class Parent {
    public static void sub(int a, int b) {
        if(b == 0) {
            System.out.println("Some Error");
            throw new IndexOutOfBoundsException(); // throwing unchecked exception
        }
    }
}

public class ThrowVsThrows {
    public static void main(String[] args) throws Exception{
        try {
            Parent.sub(3,0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
