package DSA.recursion.backtrackingandmazes;

public class MazesProblem {
    public static void main(String[] args) {
//        printPath(new StringBuilder(),3,3);
//        printPathDiagonal(new StringBuilder(),3,3);
        boolean arr[][] = {
                {true, true, false},
                {true, false, true},
                {true, true, true},
                {true, false, true}
        };
        pathWithObstacle(new StringBuilder(), arr, 0, 0);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        return count(r - 1, c) + count(r, c - 1);
    }

    static void printPath(StringBuilder p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p.toString());
            return;
        }
        if (r != 1) {
            printPath(new StringBuilder(p).append("D"), r - 1, c);

        }
        if (c != 1) {
            printPath(new StringBuilder(p).append("R"), r, c - 1);
        }
    }

    static void printPathDiagonal(StringBuilder p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p.toString());
            return;
        }
        if (r > 1) {
            printPathDiagonal(new StringBuilder(p).append("V"), r - 1, c);
        }
        if (c > 1) {
            printPathDiagonal(new StringBuilder(p).append("H"), r, c - 1);
        }
        if (r > 1 && c > 1) {
            printPathDiagonal(new StringBuilder(p).append("D"), r - 1, c - 1);
        }

    }

    static void pathWithObstacle(StringBuilder p, boolean[][] arr, int row, int col) {
        if (row == arr.length - 1 && col == arr[0].length - 1) {
            System.out.println(p.toString());
            return;
        }
        if (row < arr.length - 1 && col < arr[0].length - 1 && arr[row + 1][col + 1]) {
            pathWithObstacle(new StringBuilder(p).append("D"), arr, row + 1, col + 1);
        }
        if (row < arr.length - 1 && arr[row + 1][col]) {
            pathWithObstacle(new StringBuilder(p).append("V"), arr, row + 1, col);
        }

        if (col < arr[0].length - 1 && arr[row][col + 1]) {
            pathWithObstacle(new StringBuilder(p).append("H"), arr, row, col + 1);
        }
    }
}
