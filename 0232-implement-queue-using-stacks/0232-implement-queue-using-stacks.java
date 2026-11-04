import java.util.*;

class MyQueue {

    Stack<Integer> s = new Stack<>();

    public MyQueue() {
    }

    // Enqueue
    public void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }

        int top = s.pop();

        push(x);

        s.push(top);
    }

    // Dequeue
    public int pop() {
        if (s.isEmpty()) return -1;

        return s.pop();
    }

    // Front
    public int peek() {
        if (s.isEmpty()) return -1;

        return s.peek();
    }

    // Empty
    public boolean empty() {
        return s.isEmpty();
    }
}