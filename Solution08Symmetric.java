/**
 * Solution 08 - Symmetric Matrix
 *
 * Problem statement and examples: exercises/Exercise08Symmetric.java
 * The method signatures here match the starter file exactly.
 */
public class Solution08Symmetric {

    public static boolean isSymmetric(int[][] grid) {
        if (grid.length == 0) {
            return false;
        }

        for (int r = 0; r < grid.length; r++) {
            if (grid[r].length != grid.length) {
                return false;
            }
        }

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {
                if (grid[r][c] != grid[c][r]) {
                    return false;
                }
            }
        }
        return true;
    }
}
