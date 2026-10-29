/**
 * Solution 07 - Transpose a Matrix
 *
 * Problem statement and examples: exercises/Exercise07Transpose.java
 * The method signatures here match the starter file exactly.
 */
public class Solution07Transpose {

    public static int[][] transpose(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] result = new int[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[c][r] = grid[r][c];
            }
        }
        return result;
    }
}
