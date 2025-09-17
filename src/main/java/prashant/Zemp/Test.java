package prashant.Zemp;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), count = 0;
        StringBuilder ans = new StringBuilder();

        while(num >= 1) {
            if(num % 2 == 0) {
                ans.append('0');
                count++;
            }
            else
                ans.append('1');

            num = num/2;
        }
        ans.reverse();
        System.out.println(ans + " " + count);
    }
}