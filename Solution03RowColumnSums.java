/**
 * Solution 03 - Row and Column Sums
 *
 * Problem statement and examples: exercises/Exercise03RowColumnSums.java
 * The method signatures here match the starter file exactly.
 */
public class Solution03RowColumnSums {

    public static int[] rowSums(int[][] grid) {
        int[] sums = new int[grid.length];
        for (int r = 0; r < grid.length; r++) {
            int sum = 0;
            for (int c = 0; c < grid[r].length; c++) {
                sum += grid[r][c];
            }
            sums[r] = sum;
        }
        return sums;
    }

    public static int[] colSums(int[][] grid) {
        // A zero-row grid cannot tell us how many columns it used to have.
        if (grid.length == 0) {
            return new int[0];
        }

        int[] sums = new int[grid[0].length];
        for (int c = 0; c < grid[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < grid.length; r++) {
                sum += grid[r][c];
            }
            sums[c] = sum;
        }
        return sums;
    }
}
