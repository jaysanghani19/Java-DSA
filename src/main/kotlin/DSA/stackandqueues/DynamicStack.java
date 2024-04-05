package DSA.stackandqueues;

public class DynamicStack extends Stacks {
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int val) {
        if (pointer >= (data.length - 1)) {
            int[] temp = new int[data.length * 2];
            size = data.length * 2;
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        super.push(val);

    }
}
