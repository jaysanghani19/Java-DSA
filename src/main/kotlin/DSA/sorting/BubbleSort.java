package DSA.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int [] arr = {2,1,5,2,4,8,19,4};
        int [] arr = {2,5,3,6,8,90,20,54,100,258,25,63,74,58,260};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
