package DSA.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 4, 8, 19, 4};
//        int [] arr = {2,5,3,6,8,90,20,54,100,258,25,63,74,58,260};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int finalIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[finalIndex]) {
                    finalIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[finalIndex];
            arr[finalIndex] = temp;

        }
    }
}
