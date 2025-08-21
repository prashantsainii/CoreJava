package prashant.Collections.Basics;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();
        int temp = n;
        int num = 0;
        while(n > 0) {
            int r = n%10;
            num = (num*10) + r;
            n = n/10;
        }

        if(num == temp) System.out.println("Number is palindrom");
        else System.out.println("Number is not palindrom");
    }
}
