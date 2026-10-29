/**
 * Solution 05 - Main Diagonal and Anti-Diagonal
 *
 * Problem statement and examples: exercises/Exercise05Diagonals.java
 * The method signatures here match the starter file exactly.
 */
public class Solution05Diagonals {

    public static int mainDiagonalSum(int[][] grid) {
        int n = grid.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += grid[i][i];
        }
        return sum;
    }

    public static int antiDiagonalSum(int[][] grid) {
        int n = grid.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += grid[i][n - 1 - i];
        }
        return sum;
    }
}
