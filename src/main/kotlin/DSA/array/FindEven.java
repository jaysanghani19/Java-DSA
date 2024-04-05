package DSA.array;

import java.util.Arrays;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/   FindEven
//https://leetcode.com/problems/richest-customer-wealth/description/  MaxWealth
public class FindEven {
    public static void main(String[] args) {
        int[] arr = {23, 4, 3, 2343, 23, 5, 62, 23};
        int[][] accounts = {
                {23, 43, 5, 2},
                {25, 12, 70, 2},
                {34, 34, 23},
                {23, 23}
        };
//        System.out.println(findNumbers(arr));
        System.out.println(Arrays.toString(maxWealth(accounts)));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int element : nums) {
            if (evenDigits(element)) {
                count++;
            }
        }
        return count;
    }

    static boolean evenDigits(int element) {
        int num = element;
        String number = String.valueOf(element);
        int digits = number.length();
//        while (num>0){
//            num/=10;
//            digits++;
//        }
        return digits % 2 == 0;
    }

    static int[] maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentBalance = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentBalance += accounts[i][j];
            }
            if (currentBalance > max) {
                max = currentBalance;
                index = i;
            }
        }
        return new int[]{max, index};
    }
}
