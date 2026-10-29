/**
 * Solution 02 - Traverse and Sum
 *
 * Problem statement and examples: exercises/Exercise02TraverseSum.java
 * The method signatures here match the starter file exactly.
 */
public class Solution02TraverseSum {

    public static String gridToString(int[][] grid) {
        String result = "";
        for (int r = 0; r < grid.length; r++) {
            if (r > 0) {
                result += "\n";
            }
            for (int c = 0; c < grid[r].length; c++) {
                if (c > 0) {
                    result += " ";
                }
                result += grid[r][c];
            }
        }
        return result;
    }

    public static int sumAll(int[][] grid) {
        int sum = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                sum += grid[r][c];
            }
        }
        return sum;
    }
}
