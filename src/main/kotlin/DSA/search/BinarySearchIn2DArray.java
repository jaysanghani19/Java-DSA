package DSA.search;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 5, 8},
                {3, 5, 7, 10},
                {5, 8, 11, 15},
                {10, 12, 16, 20}
        };

        int[][] arr2 = {
                {2, 3, 5, 8},
                {10, 12, 15, 20},
                {21, 25, 28, 30},
                {32, 36, 40, 45}
        };
    }

    static int[] linearSearchIn2DArray(int[][] arr, int target) {
        int[] res = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    res = new int[]{i, j};
                    return res;
                }
            }
        }
        return res;
    }

    static int[] binarySearchIn2DArray(int[][] arr, int target) {
        int row = 0, column = arr.length - 1;
        while (row < arr.length && column >= 0) {
            if (arr[row][column] == target) {
                return new int[]{row, column};
            } else if (arr[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
