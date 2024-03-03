package DSA.recursion.basicproblems;

public class ZeroInNumber {
    public static void main(String[] args) {
        System.out.println(solution(250500));
    }
    static int solution(int n){
        if (n<10){
            return isZero(n);
        } else {
            return isZero(n%10)+solution(n/10);
        }
    }
    static int isZero(int n){
        if (n==0) return 1;
        else return 0;
    }
}
