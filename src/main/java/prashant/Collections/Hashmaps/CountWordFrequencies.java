package prashant.Collections.Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " + n + " words");

        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String word = sc.nextLine();
            arr.add(word);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            String word = arr.get(i);
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
