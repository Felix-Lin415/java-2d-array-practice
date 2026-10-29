/**
 * Solution 01 - Create and Fill a 2D Array
 *
 * Problem statement and examples: exercises/Exercise01CreateGrid.java
 * The method signatures here match the starter file exactly.
 */
public class Solution01CreateGrid {

    public static int[][] createGrid(int rows, int cols, int value) {
        int[][] grid = new int[rows][cols];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c] = value;
            }
        }
        return grid;
    }

    public static int[][] createNumberedGrid(int rows, int cols) {
        int[][] grid = new int[rows][cols];
        int next = 1;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                grid[r][c] = next;
                next++;
            }
        }
        return grid;
    }
}
