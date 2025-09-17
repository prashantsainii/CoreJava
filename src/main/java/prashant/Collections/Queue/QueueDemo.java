package prashant.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Head in a queue : " + queue.peek());       // Retrieves the head of the queue. Returns null if the queue is empty.
        System.out.println("Head in a queue : " + queue.element());    // Retrieves the head of the queue. Throws NoSuchElementException if empty.

        System.out.println("Head removed is : " + queue.poll());       // Retrieves and removes the head of the queue. Returns null if the queue is empty.
        System.out.println("Head removed is : " + queue.remove());     // Retrieves and removes the head of the queue. Throws NoSuchElementException if the queue is empty.
    }
}
