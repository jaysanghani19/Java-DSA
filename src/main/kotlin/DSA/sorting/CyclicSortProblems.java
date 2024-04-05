package DSA.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortProblems {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(problem448(arr));
    }

    //    Problem Link - https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    static List<Integer> problem448(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i + 1) {
                int current = arr[i];
                if (arr[current - 1] != current) {
                    int temp = arr[i];
                    arr[i] = arr[temp - 1];
                    arr[temp - 1] = temp;
                } else {
//                    System.out.println(arr[current - 1]);
                    break;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }

    //    Problem Statement - https://leetcode.com/problems/missing-number/
    static int problem268(int[] arr) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return i;
    }

    static void cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[i] == arr.length) {
                        int temp = arr[i];
                        arr[i] = arr[arr.length - 1];
                        arr[arr.length - 1] = temp;
                    } else {
                        int temp = arr[i];
                        arr[i] = arr[temp];
                        arr[temp] = temp;
                    }
                    if (arr[i] == i) {
                        break;
                    }
                }
            }
        }
    }
}
