package DSA.recursion.introduction;

public class RecursionBasics {
    public static void main(String[] args) {
        printNNumber(4);
    }
    static void printNNumber(int n){
        if (n==0){
            return;
        } else {
            printNumber(n);
            printNNumber(n-1);
        }
    }
    static void printNumber(int n){
        System.out.println(n);
    }
    static void message(){
        System.out.println("Hello World");
    }
    static void sendNTimeMessage(int n){
        if (n>1){
            message();
            sendNTimeMessage(n-1);
        } else if (n==1){
            message();
            return;
        }
    }
}
