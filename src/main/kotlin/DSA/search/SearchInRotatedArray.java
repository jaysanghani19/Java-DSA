package DSA.search;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int [] arr2 = {2,3,5,6,1};
        int [] arr3 = {2,3,5,6};

        System.out.println(findTimesOfRotation(arr));
        System.out.println(findTimesOfRotation(arr2));
        System.out.println(findTimesOfRotation(arr3));

    }
    static int findPivot(int arr[]){
        int start =0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if (mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid>1&& arr[mid] < arr[mid-1]) {
                return mid-1;
            } else if (arr[mid]>arr[0]) {
                start = mid+1;
            } else if (arr[mid]<arr[0]) {
                end = mid-1;
            }
        }
        return -1;
    }
    static int findTimesOfRotation(int [] arr){
        return findPivot(arr)+1;
    }
}
