package DSA.stackandqueues;

import java.util.Stack;

// Leetcode Problem 232 - https://leetcode.com/problems/implement-queue-using-stacks/

public class LCProblem232QueueUsingStacks {

    int ptr = -1;
    Stack<Integer> main = new Stack<>(), temp = new Stack<>();


    public void push(int x) {
        ptr++;
        main.push(x);
    }

    public int pop() {
        for (int i = 0; i < (ptr + 1); i++) {
            temp.push(main.pop());
        }
        int res = temp.pop();
        ptr--;
        for (int i = 0; i < (ptr + 1); i++) {
            main.push(temp.pop());
        }
        return res;
    }

    public int peek() {
        for (int i = 0; i < (ptr + 1); i++) {
            temp.push(main.pop());
        }
        int res = temp.peek();
        for (int i = 0; i < (ptr + 1); i++) {
            main.push(temp.pop());
        }
        return res;
    }

    public boolean empty() {
        if (ptr == -1) return true;
        else return false;

    }
}
