package DSA.recursion.basicproblems;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(12345, 0));
    }

    static int reverse(int n, int size) {
        if (n < 10) {
            return n;
        } else {
            if (size == 0) {
                size = getSize(n);
            }
            return (int) (((n % 10) * (Math.pow(10, size))) + reverse(n / 10, size - 1));
        }
    }

    static int getSize(int number) {
//        int res=0;
//        while (number>10){
//            res++;
//            number/=10;
//        }
        return (int) (Math.log10(number));
    }
}
