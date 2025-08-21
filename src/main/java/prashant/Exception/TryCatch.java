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
            System.out.println(e);

        }
    }
}
