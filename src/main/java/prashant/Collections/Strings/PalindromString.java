package prashant.Collections.Strings;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");

        String str = sc.nextLine();
        String reversedStr = "";

        for(int i=str.length()-1; i>=0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        if(reversedStr.equals(str)) {
            System.out.println("Word is palindrom");
        }
        else System.out.println("Word is not palindrom");
    }
}
