/**
 * Exercise 04 - Maximum, Minimum and Position
 *
 * Problem
 *   max returns the largest value in the grid.
 *   min returns the smallest value in the grid.
 *   maxPosition returns the position of the largest value as {row, column}.
 *   If the largest value appears more than once, return the first position
 *   in row-major order (smallest row, then smallest column).
 *
 * Concepts
 *   - starting a search with grid[0][0] instead of 0
 *   - updating a best value while traversing
 *   - remembering two indexes at the same time
 *   - strict comparison (>) keeps the first maximum
 *
 * Example
 *   {{3, 8, 1},
 *    {-4, 8, 6}}
 *
 *   max          -> 8
 *   min          -> -4
 *   maxPosition  -> {0, 1}
 *
 * Assumptions
 *   The grid has at least one row and one column. There are no null rows.
 *
 * Hint
 *   Copy grid[0][0] into both "best" and "smallest" before the loops. If you
 *   start from 0, a grid of negative numbers will give the wrong answer.
 *   For maxPosition, update the saved row and column only when the new value
 *   is strictly greater than the current best.
 *
 * Solution
 *   solutions/Solution04MaxMin.java
 */
public class Exercise04MaxMin {

    public static int max(int[][] grid) {
        // TODO: return the largest value.
        return 0;
    }

    public static int min(int[][] grid) {
        // TODO: return the smallest value.
        return 0;
    }

    public static int[] maxPosition(int[][] grid) {
        // TODO: return {row, column} of the first largest value.
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {3, 8, 1},
            {-4, 8, 6}
        };

        System.out.println("max: " + max(grid));
        System.out.println("min: " + min(grid));

        int[] position = maxPosition(grid);
        System.out.println("maxPosition: (" + position[0] + ", " + position[1] + ")");
    }
}
