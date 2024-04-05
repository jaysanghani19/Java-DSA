package DSA.stackandqueues;

public class Main {
    public static void main(String[] args) throws Exception {
//        DynamicStack stack = new DynamicStack(3);
//        stack.push(25);
//        stack.push(27);
//        stack.push(29);
//        stack.push(22);
//
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();

        Queues queue = new Queues(4);
        queue.push(24);
        queue.push(25);
        queue.push(27);
        queue.push(28);
//        queue.push(29);

//        queue.peep();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
//        queue.pop();
        queue.push(29);

        queue.pop();


    }
}
