package DSA.stackandqueues;

public class Stacks {
    int size = 5;

    public Stacks(int size) {
        this.size = size;
        data = new int[size];
    }

    public Stacks() {
    }

    int[] data = new int[size];
    int pointer = -1;

    public void push(int val) {
        if (pointer < (size - 1)) {
            data[pointer + 1] = val;
            pointer++;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (pointer >= 0) {
            System.out.println(data[pointer]);
            pointer--;
        } else {
            System.out.println("Stack UnderFlow");
        }
    }

    public int peep() {
        if (pointer > 0) {
            return data[pointer];
        } else {
            return -1;
        }
    }
}
