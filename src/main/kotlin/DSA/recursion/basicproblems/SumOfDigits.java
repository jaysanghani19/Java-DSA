package DSA.recursion.basicproblems;

public class SumOfDigits {
    public static void main(String[] args) {
//        System.out.println(sumOfDigits(252525));
        System.out.println(productOfDigits(2524));
    }
    static int sumOfDigits(int n){
        if (n<10){
            return n;
        }
        int remainder = n%10;
        return remainder+sumOfDigits(n/10);
    }

    static int productOfDigits(int n){
//        System.out.println("Number "+n);
        if (n<10){
            return n;
        }
        int remainder = n%10;
        return remainder*productOfDigits(n/10);
    }
}
