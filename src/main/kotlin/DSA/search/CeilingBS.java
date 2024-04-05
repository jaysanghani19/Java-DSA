package DSA.search;

//  Problem Statement : Find Ceiling(Given Target : Integer)
//  Smallest element in the array which is greater than or equal to the target


//  Problem Statement : Find Floor (Given Target : Integer)
//  Smallest element in the array which is smaller than or equal to the target
public class CeilingBS {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 23, 25, 32};

        System.out.println("Floor of 1,3,7,15,27");
        System.out.println(1 + " " + findFloor(arr, 3));
        System.out.println(3 + " " + findFloor(arr, 3));
        System.out.println(2 + " " + findFloor(arr, 7));
        System.out.println(4 + " " + findFloor(arr, 15));
        System.out.println(5 + " " + findFloor(arr, 40));

        System.out.println(" ");
        System.out.println("Ceiling of 3,7,15,27,40");
        System.out.println(2 + " " + findCeiling(arr, 3));
        System.out.println(1 + " " + findCeiling(arr, 7));
        System.out.println(3 + " " + findCeiling(arr, 15));
        System.out.println(4 + " " + findCeiling(arr, 24));
        System.out.println(5 + " " + findCeiling(arr, 30));

    }

    static int findCeiling(int[] arr, int key) {
        if (arr[arr.length - 1] < key) {
            return -1;
        } else {
            int start = 0, end = arr.length - 1;
            int mid = start + (end - start) / 2;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] > key) {
                    end = mid - 1;
                } else if (arr[mid] < key) {
                    start = mid + 1;
                } else if (arr[mid] == key) {
                    return arr[mid];
                }
            }
            return arr[start];
        }

    }

    static int findFloor(int[] arr, int key) {
        if (arr[0] > key) {
            return -1;
        } else {
            int start = 0, end = arr.length - 1;
            int mid = start + (end - start) / 2;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] > key) {
                    end = mid - 1;
                } else if (arr[mid] < key) {
                    start = mid + 1;
                } else if (arr[mid] == key) {
                    return arr[mid];
                }
            }
            return arr[end];
        }
    }

}
