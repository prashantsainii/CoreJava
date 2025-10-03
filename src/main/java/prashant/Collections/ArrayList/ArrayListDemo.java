package prashant.Collections.ArrayList;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        addElementsInList();
        replaceElementInList();
        arrayToArrayList();

    }

    public static void addElementsInList() {
        Scanner sc = new Scanner(System.in);
        // Add elements in list
        int numOfEle = Integer.parseInt(sc.nextLine());
        List<Character> list = new ArrayList<>();
        for(int i=0; i<numOfEle; i++) {
            list.add(sc.nextLine().charAt(0));
        }
        System.out.println(list);

        // remove elements from list
        System.out.println("Enter the index you want to remove");
        int indexToRemove = Integer.parseInt(sc.nextLine());

        list.remove(indexToRemove);
        System.out.println("List after removal : " + list);

    }

    public static void replaceElementInList() {
        List<Character> list = Arrays.asList('A', 'B', 'C', 'D', 'E');
        int idx = 2;
        Character ele = 'X';

        list.set(2, ele);
        System.out.println(list);

    }

    public static void arrayToArrayList() {
        String[] strArr = {"Prashant", "Saini", "Noida", "Bangalore"};

        List<String> ls = Arrays.asList(strArr);
//        ls.add("Delhi");    // not allowed, and will throw error

        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        list.add("Delhi");
        System.out.println(list);

//        Collections.addAll(list, "prashant", "Saini");      // also works
//        Collections.addAll(list, strArr);                   // also works

        // check if two lists are equal or not
        if(list.equals(ls)) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
