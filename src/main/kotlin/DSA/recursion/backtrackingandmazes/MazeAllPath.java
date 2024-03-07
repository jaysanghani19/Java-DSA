package DSA.recursion.backtrackingandmazes;

import java.util.Arrays;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean arr[][] = {
                {true, true, false},
                {true, true, true},
                {true, true, true},

        };
        paths(new StringBuilder(), arr, 0, 0);
    }

    static void paths(StringBuilder p, boolean[][] arr, int row, int col) {
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            int [][] res = new int[arr.length][arr[0].length];
            int r=0,c=0;
            res[0][0]=1;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i)=='F'){
                    r++;
                    c++;
                    res[r][c]=i+2;
                } else if (p.charAt(i)=='D') {
                    r++;
                    res[r][c]=i+2;
                } else if (p.charAt(i)=='U') {
                    r--;
                    res[r][c]=i+2;
                }
                else if (p.charAt(i)=='R') {
                    c++;
                    res[r][c]=i+2;
                } else if (p.charAt(i)=='L') {
                    c--;
                    res[r][c]=i+2;
                }
            }
            for (int i = 0; i < res.length; i++) {
                System.out.println(Arrays.toString(res[i]));
            }
            System.out.println(p.toString());
            return;
        }
        arr[row][col] = false;
        if (row < arr.length - 1 && col < arr[0].length - 1 && arr[row + 1][col + 1]) {
            paths(new StringBuilder(p).append("F"), arr, row + 1, col + 1);
        }
        if (row < arr.length - 1 && arr[row + 1][col]) {
            paths(new StringBuilder(p).append("D"), arr, row + 1, col);
        }

        if (col < arr[0].length - 1 && arr[row][col + 1]) {
            paths(new StringBuilder(p).append("R"), arr, row, col + 1);
        }

        if (row > 0 && arr[row - 1][col]) {
            paths(new StringBuilder(p).append("U"), arr, row - 1, col);
        }

        if (col > 0 && arr[row][col - 1]) {
            paths(new StringBuilder(p).append("L"), arr, row, col - 1);
        }
        arr[row][col] = true;
    }
}
