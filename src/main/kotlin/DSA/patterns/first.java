package DSA.patterns;

public class first {
    public static void main(String[] args) {
//        Pattern 1
//        for (int i=0;i<5;i++){
//            System.out.println("*****");
//        }
//        System.out.println( );

//        Pattern 2
//        for (int i=0;i<5;i++){
//            for (int j=0;j<=i;j++){
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
//
//        Pattern 3
//        System.out.println();
//        for (int i=0;i<5;i++){
//            for (int j=5;j>=i;j--){
//                System.out.printf("*");
//            }
//            System.out.println();
//        }

//        System.out.println( );
//        for (int i=0;i<5;i++){
//            for (int j=0;j<=i;j++){
//                System.out.printf("%d",j+1);
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        for (int i=0;i<5;i++){
//            for (int j=5;j>i;j--){
//                System.out.printf("%d",j);
//            }
//            System.out.println();
//        }

        pattern30(5);
    }

    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        int temp = n;
        for (int i = 0; i < n * 2; i++) {
            if (i <= n) {
                for (int j = 0; j < i; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            } else {
                temp--;
                for (int j = 0; j < temp; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        int temp = n;
        int temp2 = 0;
        for (int i = 1; i < 2 * n + 1; i++) {
            if (i <= n) {
                for (int j = 1; j < n - i + 1; j++) {
                    System.out.printf(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.printf("* ");
                }
                System.out.println();
            } else {
                temp--;
                temp2++;
                for (int j = 0; j < temp2; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < temp; j++) {
                    System.out.printf("* ");
                }
                System.out.println();
            }
        }
    }

    static void pattern30(int n) {
        int temp = n;
        for (int i = 0; i < (2 * n) + 1; i++) {
            if (i <= n) {
                for (int j = 0; j < n - i; j++) {
                    System.out.printf("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.printf("%d ", j);
                }

                for (int j = 2; j < i + 1; j++) {
                    System.out.printf("%d ", j);
                }
                System.out.println();
            } else {
                temp--;
                for (int j = 0; j < n - temp; j++) {
                    System.out.printf("  ");
                }
                for (int j = temp; j >= 1; j--) {
                    System.out.printf("%d ", j);
                }
                for (int j = 2; j < temp + 1; j++) {
                    System.out.printf("%d ", j);
                }
                System.out.println();
            }
        }
    }
}
