package prashant.Collections.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
//        st.add(50);     // belongs to Vector(Parent of class Stack), so we should not use it directly

        System.out.println("Position in stack : " + st.search(50));       // Returns the 1-based position of the object from the top of the stack. Returns -1 if not found.
        System.out.println("Top value is : " + st.peek());         // Returns the element at the top of the stack without removing it.
        System.out.println("Top value removed is : " + st.pop());  // Removes and returns the element at the top of the stack.
        System.out.println("Stack is empty ? " + st.empty());      // Checks whether the stack is empty (true/false).

    }
}
