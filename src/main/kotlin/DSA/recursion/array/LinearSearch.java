package DSA.recursion.array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={2,5,23,54,23,63,23,21};
        System.out.println(search(arr,0,20));
    }
    static boolean search(int []arr,int start,int target){
        if (start>=arr.length){
            return false;
        }else {
            return arr[start] == target || search(arr, start + 1, target);
        }

    }
}
