package DSA.recursion.basicproblems;

public class BasicProblems {
    public static void main(String[] args) {
        printNTo1Number(5);
        print1ToNNumber(5);
    }

    //    Problem Statement : Print Numbers from n to 1
    static void printNTo1Number(int n) {
        if (n > 0) {
            System.out.println(n);
            printNTo1Number(n - 1);
            return;
        } else {
            return;
        }
    }

    static void print1ToNNumber(int n) {
        if (n > 0) {
            print1ToNNumber(n - 1);
            System.out.println(n);
            return;
        } else {
            return;
        }
    }
}
