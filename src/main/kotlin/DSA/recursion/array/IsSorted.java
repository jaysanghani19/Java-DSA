package DSA.recursion.array;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 12, 15};
        System.out.println(solution(arr, 0));
    }

    static boolean solution(int[] arr, int index) {
        if (index > arr.length - 2) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return solution(arr, index + 1);
        } else {
            return false;
        }
    }
}
