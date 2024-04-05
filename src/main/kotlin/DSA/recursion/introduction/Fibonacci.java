package DSA.recursion.introduction;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(nThFibonacci(40));
    }

    static long nThFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else {
            return nThFibonacci(n - 1) + nThFibonacci(n - 2);
        }
    }
}
