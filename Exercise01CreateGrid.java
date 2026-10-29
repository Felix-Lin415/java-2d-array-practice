/**
 * Exercise 01 - Create and Fill a 2D Array
 *
 * Problem
 *   Write two methods that create a 2D int array.
 *
 *   createGrid returns a grid with `rows` rows and `cols` columns, where
 *   every cell holds value.
 *
 *   createNumberedGrid returns a grid with `rows` rows and `cols` columns,
 *   filled with 1, 2, 3, ... in row-major order: left to right, then top to
 *   bottom.
 *
 * Concepts
 *   - creating a 2D array with new int[rows][cols]
 *   - the difference between grid.length (rows) and grid[0].length (columns)
 *   - nested for loops
 *
 * Example
 *   createGrid(2, 3, 7)       -> {{7, 7, 7}, {7, 7, 7}}
 *   createNumberedGrid(2, 3)  -> {{1, 2, 3}, {4, 5, 6}}
 *   createNumberedGrid(3, 1)  -> {{1}, {2}, {3}}
 *
 * Assumptions
 *   rows >= 1 and cols >= 1.
 *
 * Hint
 *   Fill the array inside a nested loop. For the numbered grid, keep a
 *   counter that starts at 1 and increment it after every assignment.
 *
 * Solution
 *   solutions/Solution01CreateGrid.java
 */
public class Exercise01CreateGrid {

    public static int[][] createGrid(int rows, int cols, int value) {
        // TODO: create the array and fill every cell with value.
        return new int[rows][cols];
    }

    public static int[][] createNumberedGrid(int rows, int cols) {
        // TODO: fill the array with 1, 2, 3, ... in row-major order.
        return new int[rows][cols];
    }

    public static void main(String[] args) {
        System.out.println("createGrid(2, 3, 7):");
        printGrid(createGrid(2, 3, 7));

        System.out.println("createNumberedGrid(2, 3):");
        printGrid(createNumberedGrid(2, 3));
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
