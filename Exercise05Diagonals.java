/**
 * Exercise 05 - Main Diagonal and Anti-Diagonal
 *
 * Problem
 *   mainDiagonalSum returns the sum of the main diagonal of a square grid.
 *   The main diagonal runs from the top-left corner to the bottom-right
 *   corner, so its cells are grid[i][i].
 *
 *   antiDiagonalSum returns the sum of the other diagonal. It runs from the
 *   top-right corner to the bottom-left corner, so its cells are
 *   grid[i][n - 1 - i], where n is the number of rows.
 *
 * Concepts
 *   - using a single loop with one index on both dimensions
 *   - the relationship row + column == n - 1 on the anti-diagonal
 *   - handling the center cell of an odd-sized grid correctly
 *
 * Example
 *   {{2, 1, 3},
 *    {4, 5, 6},
 *    {9, 8, 7}}
 *
 *   mainDiagonalSum -> 2 + 5 + 7 = 14
 *   antiDiagonalSum -> 3 + 5 + 9 = 17
 *
 *   {{4}} -> mainDiagonalSum 4, antiDiagonalSum 4
 *
 * Assumptions
 *   The grid is square (rows == columns) and has at least one row.
 *
 * Hint
 *   n = grid.length. Loop i from 0 to n - 1 once and add grid[i][i] in one
 *   method, then grid[i][n - 1 - i] in the other. The center cell of an
 *   odd-sized grid appears once in each diagonal, not twice in the same sum.
 *
 * Solution
 *   solutions/Solution05Diagonals.java
 */
public class Exercise05Diagonals {

    public static int mainDiagonalSum(int[][] grid) {
        // TODO: add grid[i][i] for every i.
        return 0;
    }

    public static int antiDiagonalSum(int[][] grid) {
        // TODO: add grid[i][n - 1 - i] for every i.
        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 1, 3},
            {4, 5, 6},
            {9, 8, 7}
        };

        System.out.println("mainDiagonalSum: " + mainDiagonalSum(grid));
        System.out.println("antiDiagonalSum: " + antiDiagonalSum(grid));
    }
}
