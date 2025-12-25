package prashant.Collections.Hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();

        for(Character ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


    }
}
