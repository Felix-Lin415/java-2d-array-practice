/**
 * Exercise 02 - Traverse and Sum
 *
 * Problem
 *   gridToString returns the grid as a single String.
 *     - one space between values in the same row
 *     - one newline between rows
 *     - no trailing space at the end of a row
 *     - no newline after the last row
 *   A grid with zero rows becomes an empty string.
 *
 *   sumAll returns the sum of every value in the grid.
 *   A grid with zero rows has sum 0.
 *
 * Concepts
 *   - row-major traversal with nested for loops
 *   - grid.length and grid[r].length
 *   - building a String with concatenation
 *   - accumulator variables
 *
 * Example
 *   {{1, 2, 3}, {4, 5, 6}}  ->  "1 2 3\n4 5 6"   and sum 21
 *   {{5}}                   ->  "5"               and sum 5
 *   {{-2, 5}}               ->  "-2 5"            and sum 3
 *   new int[0][]            ->  ""                and sum 0
 *
 * Assumptions
 *   The grid is rectangular and contains no null rows. Zero rows are allowed.
 *
 * Hint
 *   Add a space before a value only when it is not the first value in its row.
 *   Add a newline before a row only when it is not the first row. That keeps
 *   the output free of trailing spaces and trailing newlines.
 *
 * Solution
 *   solutions/Solution02TraverseSum.java
 */
public class Exercise02TraverseSum {

    public static String gridToString(int[][] grid) {
        // TODO: build the text for the grid.
        return "";
    }

    public static int sumAll(int[][] grid) {
        // TODO: add every value to a running total.
        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("gridToString({{1, 2, 3}, {4, 5, 6}}):");
        System.out.println(gridToString(grid));
        System.out.println("sumAll(...): " + sumAll(grid));
    }
}
