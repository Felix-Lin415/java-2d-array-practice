/**
 * Exercise 08 - Symmetric Matrix
 *
 * Problem
 *   isSymmetric returns true when the grid is a square matrix and
 *   grid[row][column] == grid[column][row] for every pair of positions.
 *   A grid that is not square is never symmetric. A grid with zero rows is
 *   not symmetric either, so it returns false.
 *
 * Concepts
 *   - checking a precondition (square) before the main loop
 *   - comparing mirrored cells
 *   - returning false as soon as a mismatch is found
 *   - boolean methods with early return
 *
 * Example
 *   {{1, 2, 3},
 *    {2, 4, 5},
 *    {3, 5, 6}}  -> true
 *
 *   {{1, 2, 3},
 *    {4, 5, 6},
 *    {7, 8, 9}}  -> false
 *
 *   {{1, 2, 3},
 *    {4, 5, 6}}  -> false   (not square)
 *
 *   {{4}}        -> true
 *
 * Assumptions
 *   The grid contains no null rows. Zero rows are allowed and return false.
 *
 * Hint
 *   Return false immediately when grid.length == 0. Then check that every
 *   row has the same length as grid.length. Finally, use two loops and
 *   compare grid[r][c] with grid[c][r]. Return false on the first mismatch;
 *   if the loops finish, return true.
 *
 * Solution
 *   solutions/Solution08Symmetric.java
 */
public class Exercise08Symmetric {

    public static boolean isSymmetric(int[][] grid) {
        // TODO: non-square grids are false; compare mirrored cells.
        return false;
    }

    public static void main(String[] args) {
        int[][] symmetric = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        int[][] notSymmetric = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] rectangle = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] empty = new int[0][];

        System.out.println("isSymmetric(symmetric 3x3): " + isSymmetric(symmetric));
        System.out.println("isSymmetric(not symmetric 3x3): " + isSymmetric(notSymmetric));
        System.out.println("isSymmetric(2x3): " + isSymmetric(rectangle));
        System.out.println("isSymmetric(zero rows): " + isSymmetric(empty));
    }
}
