/**
 * Exercise 03 - Row and Column Sums
 *
 * Problem
 *   rowSums returns a new array. Entry r is the sum of row r.
 *   colSums returns a new array. Entry c is the sum of column c.
 *
 *   The returned arrays are new; the input grid must not be changed.
 *
 * Concepts
 *   - an outer loop and an inner loop can have different jobs
 *   - row-major traversal versus column-major traversal
 *   - creating a result array with the right length
 *
 * Example
 *   {{1,  2,  3,  4},
 *    {5,  6,  7,  8},
 *    {9, 10, 11, 12}}
 *
 *   rowSums -> {10, 26, 42}
 *   colSums -> {15, 18, 21, 24}
 *
 *   {{1, 2, 3, 4}}  ->  rowSums {10}, colSums {1, 2, 3, 4}
 *   {{1}, {2}, {3}} ->  rowSums {1, 2, 3}, colSums {6}
 *
 * Assumptions
 *   The grid is rectangular and contains no null rows.
 *
 *   Zero rows are allowed. A grid created with new int[0][5] does NOT keep
 *   the 5, so a grid with zero rows has no column count. For that input both
 *   methods return an array of length 0. colSums therefore needs to check
 *   grid.length == 0 before using grid[0].
 *
 * Hint
 *   rowSums: reset the sum at the start of every row.
 *   colSums: swap the loops. For each column c, visit rows 0..grid.length-1
 *   and add grid[r][c].
 *
 * Solution
 *   solutions/Solution03RowColumnSums.java
 */
public class Exercise03RowColumnSums {

    public static int[] rowSums(int[][] grid) {
        // TODO: one sum per row.
        return new int[grid.length];
    }

    public static int[] colSums(int[][] grid) {
        // TODO: one sum per column. Return an empty array when grid has no rows.
        return new int[0];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.print("rowSums: ");
        printArray(rowSums(grid));
        System.out.print("colSums: ");
        printArray(colSums(grid));
    }

    private static void printArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(values[i]);
        }
        System.out.println();
    }
}
