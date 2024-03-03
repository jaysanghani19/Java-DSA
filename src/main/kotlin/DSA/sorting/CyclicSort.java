package DSA.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,8,6,7};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int [] arr){
        for (int i=0;i< arr.length;i++){
            while (arr[i]!=i+1){
                int temp = arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
}
