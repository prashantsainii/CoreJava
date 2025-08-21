package prashant.Strings;

import java.util.Scanner;

public class PracticalUsecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the word");
        String cc = sc.next();

        sc.nextLine();      // to be used in all the cases where first input is not string

        System.out.println("Enter the string");
        String input = sc.nextLine();

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if(i == 0 || input.charAt(i-1) == ' ') {
                ans.append(Character.toUpperCase(ch));

            }
            else ans.append(ch);
        }
        System.out.println(cc + " " + ans);
    }
}
