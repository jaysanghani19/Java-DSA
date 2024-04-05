package DSA.search;

public class BSInInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 110, 120, 130, 150, 170};
        System.out.println(binarySearchInInfiniteArray(arr, 10));
    }

    static int binarySearchInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int range = 2;
        boolean inPosition = false;
        while (!inPosition) {
            if (target < arr[end] && target > arr[start]) {
                inPosition = true;
            } else {
                range *= 2;
                start = end + 1;
                end += range;
            }
        }
        return binarySearchInIncreasing(arr, target, start, end);
    }

    static int binarySearchInIncreasing(int[] arr, int key, int startingIndex, int endingIndex) {

        int start = startingIndex, end = endingIndex;
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
}
