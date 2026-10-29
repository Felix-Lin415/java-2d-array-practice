/**
 * Solution 06 - Conditional Counting
 *
 * Problem statement and examples: exercises/Exercise06ConditionalCount.java
 * The method signatures here match the starter file exactly.
 */
public class Solution06ConditionalCount {

    public static int countGreaterThan(int[][] grid, int limit) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] > limit) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countEven(int[][] grid) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countInRange(int[][] grid, int low, int high) {
        // An empty range cannot contain any values.
        if (low > high) {
            return 0;
        }

        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] >= low && grid[r][c] <= high) {
                    count++;
                }
            }
        }
        return count;
    }
}
