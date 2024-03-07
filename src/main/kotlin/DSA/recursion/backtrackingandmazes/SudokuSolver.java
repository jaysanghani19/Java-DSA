package DSA.recursion.backtrackingandmazes;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        solve(board, 0, 0);

    }

    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private static void solve(char[][] board, int row, int col) {
        if (row == 8 && col == 8) {
            printBoard(board);
            return;
        }
        if (col == 8) {
            solve(board, row + 1, col);
        } else if (board[row][col] != '.') {
            for (int i = 0; i < 9; i++) {
                if (isSafe(board, row, col, i + 1)) {
                    System.out.println(row + " " + col);
                    board[row][col] = (char) (i + 1);
                    if (col < 8 && row <= 8) {
                        solve(board, row, col + 1);
                    } else if (col == 8 && row == 8) {
                        printBoard(board);
                        return;
                    } else if (col == 8) {
                        solve(board, row + 1, col);
                    }

                } else {
                    solve(board, row, col + 1);

                }
                board[row][col] = '.';

            }
        }

    }

    private static void printBoard(char[][] board) {
        for (char[] arr : board) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int number) {
        if (board[row][col] != '.') {
            System.out.println("Already Placed");
            return false;
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("Row");

            if (board[row][i] == (char) number) return false;
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("Column");

            if (board[i][col] == (char) number) return false;
        }
        int bsr = (row / 3) * 3;
        int bsc = (row / 3) * 3;
        int ber = bsr + 3;
        int bec = bsc + 3;
        for (int i = bsr; i < ber; i++) {
            for (int j = bsc; j < bec; j++) {
                System.out.println("In Box");

                if (board[i][j] == (char) number) return false;
            }
        }
        return true;
    }
}
