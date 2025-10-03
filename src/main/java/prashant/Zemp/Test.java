package prashant.Zemp;


import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        for(Integer i : list) {
            System.out.println(i);
        }

        // Parallel stream from a collection
        list.parallelStream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + " -> " + n));


        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        pq.add(2);
        pq.add(5);
        System.out.println(pq.element());
    }
}