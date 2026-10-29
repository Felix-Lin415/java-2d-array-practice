/**
 * Solution 04 - Maximum, Minimum and Position
 *
 * Problem statement and examples: exercises/Exercise04MaxMin.java
 * The method signatures here match the starter file exactly.
 */
public class Solution04MaxMin {

    public static int max(int[][] grid) {
        int best = grid[0][0];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] > best) {
                    best = grid[r][c];
                }
            }
        }
        return best;
    }

    public static int min(int[][] grid) {
        int smallest = grid[0][0];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] < smallest) {
                    smallest = grid[r][c];
                }
            }
        }
        return smallest;
    }

    public static int[] maxPosition(int[][] grid) {
        int best = grid[0][0];
        int[] position = {0, 0};

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] > best) {
                    best = grid[r][c];
                    position[0] = r;
                    position[1] = c;
                }
            }
        }
        return position;
    }
}
