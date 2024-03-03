package DSA.recursion.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 10, 12, 8, 9, 20, 18};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return arr;
        }
        int mid = length / 2;
        int[] right = solution(Arrays.copyOfRange(arr, 0, mid));
        int[] left = solution(Arrays.copyOfRange(arr, mid, length));
        return mergeSortedArray(right, left);
    }

    private static int[] mergeSortedArray(int[] right, int[] left) {
        int totalLength = right.length + left.length;
        int[] res = new int[totalLength];
        int rightIndex = 0, leftIndex = 0, resIndex = 0;
        while (rightIndex < right.length && leftIndex < left.length) {
            if (right[rightIndex] < left[leftIndex]) {
                res[resIndex] = right[rightIndex];
                rightIndex++;
                resIndex++;
            } else {
                res[resIndex] = left[leftIndex];
                leftIndex++;
                resIndex++;
            }
        }
        while (leftIndex < left.length) {
            res[resIndex] = left[leftIndex];
            leftIndex++;
            resIndex++;
        }
        while (rightIndex < right.length) {
            res[resIndex] = right[rightIndex];
            rightIndex++;
            resIndex++;
        }
        return res;
    }
}
