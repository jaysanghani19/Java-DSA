package DSA.recursion.basicproblems;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
