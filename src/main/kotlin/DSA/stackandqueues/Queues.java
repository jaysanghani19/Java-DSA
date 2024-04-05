package DSA.stackandqueues;

public class Queues {
    int[] data;
    int size;

    int end = -1;
    int front = -1;

    public Queues() {
        size = 5;
        initializeData(size);
    }

    public Queues(int size) {
        this.size = size;
        initializeData(size);
    }

    private void initializeData(int size) {
        data = new int[size];
    }

    public void push(int val) throws Exception {
        if (end < (size - 1)) {
            end++;
            data[end] = val;
        } else if (end == (size - 1) && front == (size - 1)) {
            end = -1;
            front = -1;
            push(val);
        } else {
            throw new Exception("OverFlow");
        }
    }

    public void pop() throws Exception {
        if (end > front) {
            front++;

            System.out.println(data[front]);
            if (front == (size - 1)) {
                front = -1;
                end = -1;
            }
        } else {
            throw new Exception("UnderFlow");
        }
    }

    public void peep() throws Exception {
        if (end > front) {
            System.out.println(data[front]);
        } else {
            throw new Exception("UnderFlow");
        }
    }
}
