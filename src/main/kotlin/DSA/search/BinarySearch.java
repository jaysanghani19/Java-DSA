package DSA.search;

public class BinarySearch {
    public static void main(String[] args) {
        var answer = 2;
//        int[] array = {23, 43, 45, 50, 55, 60, 62, 65, 69, 70, 72, 79};
        int[] arr = {2,5,10,23,25,32};

        System.out.println(binarySearch(arr,answer));
    }

    static int binarySearch(int [] arr,int target){
        if (arr[0]>arr[arr.length-1]){
           return binarySearchInDecreasing(arr,target);
        } else {
            return binarySearchInIncreasing(arr,target);
        }
    }
    static int binarySearchInIncreasing(int[] arr, int key) {

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchInDecreasing(int[] arr, int key) {

//        System.out.println(Arrays.toString(arr));
        int start = arr.length-1, end = 0;
        while (end <= start) {
            int mid = start + (end - start) / 2;
//            System.out.println(mid);
            if (arr[mid] > key) {
//                end = mid -1;
                end = mid + 1;
            } else if (arr[mid] < key) {
//                start = mid + 1;
                start = mid - 1;
            } else if (arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    static int[] reverseArray(int [] arr){
        int arrayLength = arr.length-1;
        for (int i=0;i<arrayLength/2;i++){
            int temp = arr[i];
            arr[i] = arr[arrayLength-i];
            arr[arrayLength-i] = temp;
        }
        return arr;
    }
}
