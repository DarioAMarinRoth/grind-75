package week1;

import java.util.Stack;

public class W1E13 {
//    Implement a first in first out (FIFO) queue using only two stacks.
//    The implemented queue should support all the functions of a normal queue
}


class MyQueue {

    Stack<Integer> values;
    Stack<Integer> aux;

    public MyQueue() {
        values = new Stack<>();
        aux = new Stack<>();
    }

    public void push(int x) {
        values.push(x);
    }

    public int pop() {
        invert();
        int value = aux.pop();
        revert();
        return value;
    }

    public int peek() {
        invert();
        int value = aux.peek();
        revert();
        return value;
    }

    public boolean empty() {
        return values.isEmpty();
    }

    private void invert() {
        while (!values.isEmpty()) {
            aux.push(values.pop());
        }
    }

    private void revert() {
        while (!aux.isEmpty()) {
            values.push(aux.pop());
        }
    }
}