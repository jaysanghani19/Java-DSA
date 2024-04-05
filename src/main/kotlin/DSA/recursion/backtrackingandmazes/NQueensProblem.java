package DSA.recursion.backtrackingandmazes;

import java.util.Arrays;

public class NQueensProblem {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, -1},
                {-1, -1},
                {-1, -1},
                {-1, -1},
                {-1, -1}
        };
        System.out.println(solution2(arr, 0, 5));

    }

    static int solution2(int[][] positions, int row, int n) {

        if (row == n) {
            printSolution(positions, n);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < n; col++) {
            if (canPlace(row, col, n, positions)) {
                positions[row][0] = row;
                positions[row][1] = col;
                System.out.println("Before");
                for (int[] arr : positions) {
                    System.out.println("R" + arr[0] + " C" + arr[1]);
                }
                count += solution2(positions, row + 1, n);
                positions[row][0] = -1;
                positions[row][1] = -1;
            }
            System.out.println("after");
            for (int[] arr : positions) {
                System.out.println("R" + arr[0] + " C" + arr[1]);
            }
        }
        return count;
    }

    static void solution(int[][] positions, int row, int n) {
        if (row == n) {
            printSolution(positions, n);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (canPlace(row, col, n, positions)) {
                positions[row][0] = row;
                positions[row][1] = col;
                solution(positions, row + 1, n);
                positions[row][0] = -1;
                positions[row][1] = -1;
            }
        }
    }

    private static boolean canPlace(int row, int col, int n, int[][] positions) {
        if (row == 0) {
            return true;
        }
        for (int i = 0; i < positions.length; i++) {
            if (positions[i][1] == col) {
                return false;
            }
        }

        for (int i = 0; i < positions.length; i++) {
            int currentRow = positions[i][0];
            int currentCol = positions[i][1];


            int rowDiff = (row - currentRow);
            int colDiff = (col - currentCol);
            if (rowDiff < 0) rowDiff = (-1) * rowDiff;
            if (colDiff < 0) colDiff = (-1) * colDiff;
            if (rowDiff == colDiff) {
                return false;
            }
        }
        return true;
    }

    private static void printSolution(int[][] positions, int n) {
        char[][] res = new char[n][n];
        System.out.println("solution");
        System.out.println("Positions");
        int k = 1;
        for (int[] print : positions) {
            System.out.println("Queen " + (k++) + ": " + Arrays.toString(print));
            res[print[0]][print[1]] = 'Q';
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == 'Q') {
                    System.out.print("Q ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }
}
