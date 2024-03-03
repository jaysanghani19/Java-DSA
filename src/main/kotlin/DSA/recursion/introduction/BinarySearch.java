package DSA.recursion.introduction;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={2,5,18,23,28,32,39};
        System.out.println(binarySearch(arr,45,0,arr.length));
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        if (start<end){
            int mid=start + (end-start)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                return binarySearch(arr,target,start,mid-1);
            } else {
                return binarySearch(arr,target,mid+1,end);
            }
        }else return -1;
    }
}
