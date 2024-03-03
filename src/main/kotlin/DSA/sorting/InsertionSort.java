package DSA.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
//        int [] arr = {2,1,5,2,4,8,19,4};
        int [] arr = {2,5,3,6,8,90,20,54,100,258,25,63,74,58,260};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int [] arr){
        for (int i =0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

//    static int[] insertionSort2(int [] arr){
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i =0;i<arr.length;i++){
//            if (i==0){
//                if (arr[1]<arr[0]){
//                    int temp = arr[1];
//                    arr[1]=arr[0];
//                    arr[0]=temp;
//                }
//                res.add(arr[0]);
//                res.add(arr[1]);
//                i++;
//            } else {
//                int index = ceiling(arr,arr[i],0,i);
//                System.out.println(i+"  "+index);
//                System.out.println(res);
//                res.add(index-1,arr[i]);
//            }
//        }
//        System.out.println(res);
//        int [] result = new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            result[i]=res.get(i);
//        }
//        return result;
//    }
    static int ceiling(int[] arr, int key, int startingPoint, int endingPoint) {

        if (arr[arr.length - 1] < key) {
            return -1;
        } else {
            int start = startingPoint, end = endingPoint;
            int mid = start + (end - start) / 2;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] > key) {
                    end = mid - 1;
                } else if (arr[mid] < key) {
                    start = mid + 1;
                } else if (arr[mid] == key) {
                    return mid;
                }
            }
            return start;
        }
    }
}
