/**
 * Exercise 06 - Conditional Counting
 *
 * Problem
 *   countGreaterThan returns how many values are strictly greater than limit.
 *   countEven returns how many values are even.
 *   countInRange returns how many values are between low and high, inclusive
 *   of both ends. If low > high, the range is empty and the method returns 0.
 *
 *   A grid with zero rows returns 0 from all three methods.
 *
 * Concepts
 *   - boolean expressions inside a loop
 *   - counter variables
 *   - combining conditions with &&
 *   - the fact that -8 % 2 == 0, so negative even numbers count as even
 *
 * Example
 *   {{ 4, -3,  7, 0},
 *    {10,  5, -8, 2}}
 *
 *   countGreaterThan(grid, 3) -> 4   (4, 7, 10, 5)
 *   countEven(grid)           -> 5   (4, 0, 10, -8, 2)
 *   countInRange(grid, 0, 5)  -> 4   (4, 0, 5, 2)
 *
 *   countGreaterThan({{5}}, 5)        -> 0   (5 is not greater than 5)
 *   countInRange({{0, 5, 6, -1}}, 0, 5) -> 2 (0 and 5 are included)
 *   countInRange({{2, 2, 3}}, 2, 2)   -> 2
 *   countInRange({{1, 2, 3}}, 3, 1)   -> 0   (low > high, so the range is empty)
 *
 * Assumptions
 *   The grid is rectangular and contains no null rows. Zero rows are allowed.
 *   countInRange returns 0 when low > high.
 *
 * Hint
 *   Use one counter per method. Inside the loops, write a condition and add
 *   1 only when the condition is true. The range check is
 *   value >= low && value <= high.
 *
 * Solution
 *   solutions/Solution06ConditionalCount.java
 */
public class Exercise06ConditionalCount {

    public static int countGreaterThan(int[][] grid, int limit) {
        // TODO: count values greater than limit.
        return 0;
    }

    public static int countEven(int[][] grid) {
        // TODO: count values where value % 2 == 0.
        return 0;
    }

    public static int countInRange(int[][] grid, int low, int high) {
        // TODO: count values in [low, high], including both ends.
        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {4, -3, 7, 0},
            {10, 5, -8, 2}
        };

        System.out.println("countGreaterThan(grid, 3): " + countGreaterThan(grid, 3));
        System.out.println("countEven(grid): " + countEven(grid));
        System.out.println("countInRange(grid, 0, 5): " + countInRange(grid, 0, 5));
    }
}
