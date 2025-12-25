package prashant.Exception;

public class TryCatch {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed");

            /*
             The finally block does NOT execute only when:

                System.exit() is called
                JVM crashes (OutOfMemory, internal error, native crash)
                Infinite loop or deadlock prevents reaching finally

            */
        }
    }
}
