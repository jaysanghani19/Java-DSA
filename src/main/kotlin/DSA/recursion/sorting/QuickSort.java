package DSA.recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr={2,5,3,8,10,3};
        solution(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void solution(int [] arr,int start,int end){
        if (start>=end){
            return;
        }
        int low=start,high=end;
        int mid = low + (high-low)/2;
        int pivot = arr[mid];

        while (low<=high){
            while (pivot>arr[low]){
                low++;
            }
            while (pivot<arr[high]){
                high--;
            }
            if (low<=high){
                swapInArray(arr,low,high);
                low++;
                high--;
            }
        }

        solution(arr,start,high);
        solution(arr,low,end);

    }

    private static void swapInArray(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}
