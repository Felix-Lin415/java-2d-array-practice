/**
 * Exercise 07 - Transpose a Matrix
 *
 * Problem
 *   transpose returns a new grid in which rows and columns are swapped.
 *   The original grid must not be changed.
 *
 *   If grid has r rows and c columns, the result has c rows and r columns,
 *   and result[col][row] == grid[row][col].
 *
 * Concepts
 *   - creating a new array with the dimensions swapped
 *   - writing result[c][r] instead of result[r][c]
 *   - returning a new array instead of changing the input
 *
 * Example
 *   {{1, 2, 3},
 *    {4, 5, 6}}   ->  {{1, 4},
 *                      {2, 5},
 *                      {3, 6}}
 *
 *   {{1, 2, 3}}  ->  {{1}, {2}, {3}}
 *   {{1}, {2}}   ->  {{1, 2}}
 *
 * Assumptions
 *   The grid is rectangular, has at least one row and at least one column,
 *   and contains no null rows. A zero-row grid is not tested because it does
 *   not keep a column count.
 *
 * Hint
 *   Read the input with grid[r][c] and write into the new grid with
 *   result[c][r]. Create the new grid with new int[columns][rows].
 *
 * Solution
 *   solutions/Solution07Transpose.java
 */
public class Exercise07Transpose {

    public static int[][] transpose(int[][] grid) {
        // TODO: build a new grid with rows and columns swapped.
        return new int[grid[0].length][grid.length];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("transpose({{1, 2, 3}, {4, 5, 6}}):");
        printGrid(transpose(grid));
    }

    private static void printGrid(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (c > 0) {
                    System.out.print(" ");
                }
                System.out.print(grid[r][c]);
            }
            System.out.println();
        }
    }
}
