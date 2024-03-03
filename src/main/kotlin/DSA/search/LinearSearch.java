package DSA.search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2,4,1,-1,2,5,56,23,1,5,9,11};
        int [][] arr2d = {
                {2,4,56,7,8},
                {12,34,53,2,4},
                {2,4},
                {12,45}
        };
//        System.out.println(linearSearch(arr,11)+" "+arr.length);
//        System.out.println(binarySearch(arr,11));
//        System.out.println(min(arr) +" " +max(arr));
//        System.out.println(searchIn2DArray(arr2d,23));
    }

    static int linearSearch(int[] arr,int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr,int key){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start =0,end=arr.length,mid=(start+end)/2;
        for (int i=0;i<arr.length;i++){
            mid = (start+end)/2;
            if (arr[mid]==key){
                return mid;
            } else if (arr[mid]>key) {
                end=mid;
            }else {
                start=mid;
            }
        }
        return -1;
    }

    static int min(int [] arr){
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int [] arr){
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static boolean searchIn2DArray(int [][] arr , int target){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
