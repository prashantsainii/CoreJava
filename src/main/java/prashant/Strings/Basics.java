package prashant.Strings;

public class Basics {
    public static void main(String[] args) {
        String a = "Prashant";
        String b = "Saini";

        System.out.println(a + " " + b);

        System.out.println(a.charAt(0) + " " + a.charAt(a.length() - 1));

        int count = 0;

        for(char ch : a.toCharArray()) {
            if(ch == 'a') count++;
        }
        System.out.println(count);

        String temp = "ant";

        System.out.println(a.indexOf(temp, 6));
    }
}
