/**
 * Test runner for the starter exercises in exercises/.
 *
 * Run this file after you finish each exercise to check your work.
 * The starters are incomplete on purpose, so failures on the first run are
 * expected and do not mean the test runner is broken.
 *
 * Test IDs use the pattern "exercise-case", for example 03-5 is the fifth
 * check for Exercise 03. The planned number of checks is:
 *   01: 8   02: 8   03: 8   04: 16   05: 8   06: 11   07: 7   08: 9
 * Total: 75 checks.
 */
public class TestRunner {

    private static final int[] PLANNED = {8, 8, 8, 16, 8, 11, 7, 9};
    private static final int TOTAL_PLANNED = plannedTotal();

    private static int plannedTotal() {
        int total = 0;
        for (int count : PLANNED) {
            total += count;
        }
        return total;
    }

    private static final int[] ran = new int[8];
    private static final int[] groupPassed = new int[8];

    private static int currentGroup = -1;
    private static int passed = 0;
    private static int failed = 0;
    private static int incompleteGroups = 0;

    public static void main(String[] args) {
        System.out.println("=== Java 2D Array Practice - Practice Tests ===");
        System.out.println("These checks run against the code in exercises/.");
        System.out.println("Failures at the start are expected: finish the exercises and run again.");

        try {
            test01();
        } catch (Exception e) {
            groupError(0, e);
        }
        try {
            test02();
        } catch (Exception e) {
            groupError(1, e);
        }
        try {
            test03();
        } catch (Exception e) {
            groupError(2, e);
        }
        try {
            test04();
        } catch (Exception e) {
            groupError(3, e);
        }
        try {
            test05();
        } catch (Exception e) {
            groupError(4, e);
        }
        try {
            test06();
        } catch (Exception e) {
            groupError(5, e);
        }
        try {
            test07();
        } catch (Exception e) {
            groupError(6, e);
        }
        try {
            test08();
        } catch (Exception e) {
            groupError(7, e);
        }

        printSummary();

        boolean complete = (passed + failed) == TOTAL_PLANNED;
        if (failed == 0 && complete) {
            System.out.println("All practice checks passed. Nice work!");
            System.exit(0);
        } else {
            System.out.println("Some checks failed or were not run.");
            System.out.println("Finish the TODO methods in exercises/ and run this file again.");
            System.exit(1);
        }
    }

    private static void test01() {
        startGroup(0, "Create and Fill");

        checkGrid("01-1", "createGrid(2, 3, 7)", new int[][]{{7, 7, 7}, {7, 7, 7}},
                Exercise01CreateGrid.createGrid(2, 3, 7));
        checkGrid("01-2", "createGrid(4, 1, 3)", new int[][]{{3}, {3}, {3}, {3}},
                Exercise01CreateGrid.createGrid(4, 1, 3));
        checkGrid("01-3", "createGrid(1, 4, -2)", new int[][]{{-2, -2, -2, -2}},
                Exercise01CreateGrid.createGrid(1, 4, -2));
        checkGrid("01-4", "createGrid(1, 1, -5)", new int[][]{{-5}},
                Exercise01CreateGrid.createGrid(1, 1, -5));
        checkGrid("01-5", "createGrid(2, 2, 0)", new int[][]{{0, 0}, {0, 0}},
                Exercise01CreateGrid.createGrid(2, 2, 0));
        checkGrid("01-6", "createNumberedGrid(2, 3)", new int[][]{{1, 2, 3}, {4, 5, 6}},
                Exercise01CreateGrid.createNumberedGrid(2, 3));
        checkGrid("01-7", "createNumberedGrid(3, 1)", new int[][]{{1}, {2}, {3}},
                Exercise01CreateGrid.createNumberedGrid(3, 1));
        checkGrid("01-8", "createNumberedGrid(1, 1)", new int[][]{{1}},
                Exercise01CreateGrid.createNumberedGrid(1, 1));
    }

    private static void test02() {
        startGroup(1, "Traverse and Sum");

        checkString("02-1", "gridToString({{1,2,3},{4,5,6}})", "1 2 3\n4 5 6",
                Exercise02TraverseSum.gridToString(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        checkString("02-2", "gridToString({{5}})", "5",
                Exercise02TraverseSum.gridToString(new int[][]{{5}}));
        checkString("02-3", "gridToString({{-2,5}})", "-2 5",
                Exercise02TraverseSum.gridToString(new int[][]{{-2, 5}}));
        checkString("02-4", "gridToString(empty grid)", "",
                Exercise02TraverseSum.gridToString(new int[0][]));
        checkString("02-5", "gridToString(3x3 mixed)", "0 -1 2\n3 4 -5\n6 -7 8",
                Exercise02TraverseSum.gridToString(new int[][]{{0, -1, 2}, {3, 4, -5}, {6, -7, 8}}));
        checkInt("02-6", "sumAll({{1,2,3},{4,5,6}})", 21,
                Exercise02TraverseSum.sumAll(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        checkInt("02-7", "sumAll(empty grid)", 0,
                Exercise02TraverseSum.sumAll(new int[0][]));
        checkInt("02-8", "sumAll({{-2,5}})", 3,
                Exercise02TraverseSum.sumAll(new int[][]{{-2, 5}}));
    }

    private static void test03() {
        startGroup(2, "Row and Column Sums");

        int[][] rowsGrid = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int[][] colsGrid = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        checkIntArray("03-1", "rowSums(3x4)", new int[]{10, 26, 42},
                Exercise03RowColumnSums.rowSums(rowsGrid));
        checkIntArray("03-2", "rowSums(single row)", new int[]{10},
                Exercise03RowColumnSums.rowSums(new int[][]{{1, 2, 3, 4}}));
        checkIntArray("03-3", "rowSums(single column)", new int[]{1, 2, 3},
                Exercise03RowColumnSums.rowSums(new int[][]{{1}, {2}, {3}}));
        checkIntArray("03-4", "rowSums(empty grid)", new int[]{},
                Exercise03RowColumnSums.rowSums(new int[0][]));
        checkIntArray("03-5", "colSums(3x4)", new int[]{15, 18, 21, 24},
                Exercise03RowColumnSums.colSums(colsGrid));
        checkIntArray("03-6", "colSums(single row)", new int[]{1, 2, 3, 4},
                Exercise03RowColumnSums.colSums(new int[][]{{1, 2, 3, 4}}));
        checkIntArray("03-7", "colSums(single column)", new int[]{6},
                Exercise03RowColumnSums.colSums(new int[][]{{1}, {2}, {3}}));
        checkIntArray("03-8", "colSums(empty grid)", new int[]{},
                Exercise03RowColumnSums.colSums(new int[0][]));
    }

    private static void test04() {
        startGroup(3, "Maximum, Minimum and Position");

        checkInt("04-1", "max({{3,8,1},{-4,8,6}})", 8,
                Exercise04MaxMin.max(new int[][]{{3, 8, 1}, {-4, 8, 6}}));
        checkInt("04-2", "min({{3,8,1},{-4,8,6}})", -4,
                Exercise04MaxMin.min(new int[][]{{3, 8, 1}, {-4, 8, 6}}));
        checkIntArray("04-3", "maxPosition({{3,8,1},{-4,8,6}})", new int[]{0, 1},
                Exercise04MaxMin.maxPosition(new int[][]{{3, 8, 1}, {-4, 8, 6}}));
        checkInt("04-4", "max({{-7}})", -7,
                Exercise04MaxMin.max(new int[][]{{-7}}));
        checkInt("04-5", "min({{-7}})", -7,
                Exercise04MaxMin.min(new int[][]{{-7}}));
        checkIntArray("04-6", "maxPosition({{-7}})", new int[]{0, 0},
                Exercise04MaxMin.maxPosition(new int[][]{{-7}}));
        checkInt("04-7", "max(single row)", 9,
                Exercise04MaxMin.max(new int[][]{{5, 9, 2}}));
        checkInt("04-8", "min(single row)", 2,
                Exercise04MaxMin.min(new int[][]{{5, 9, 2}}));
        checkIntArray("04-9", "maxPosition(single row)", new int[]{0, 1},
                Exercise04MaxMin.maxPosition(new int[][]{{5, 9, 2}}));
        checkInt("04-10", "max(single column)", 9,
                Exercise04MaxMin.max(new int[][]{{4}, {-1}, {9}}));
        checkInt("04-11", "min(single column)", -1,
                Exercise04MaxMin.min(new int[][]{{4}, {-1}, {9}}));
        checkIntArray("04-12", "maxPosition(single column)", new int[]{2, 0},
                Exercise04MaxMin.maxPosition(new int[][]{{4}, {-1}, {9}}));
        checkInt("04-13", "max(all negative)", -2,
                Exercise04MaxMin.max(new int[][]{{-5, -2, -9}}));
        checkInt("04-14", "min(all negative)", -9,
                Exercise04MaxMin.min(new int[][]{{-5, -2, -9}}));
        checkIntArray("04-15", "maxPosition(first of equal maxima)", new int[]{0, 1},
                Exercise04MaxMin.maxPosition(new int[][]{{4, 9, 9, 2}}));
        checkIntArray("04-16", "maxPosition(first of equal maxima across rows)", new int[]{0, 1},
                Exercise04MaxMin.maxPosition(new int[][]{{1, 9}, {9, 2}}));
    }

    private static void test05() {
        startGroup(4, "Main Diagonal and Anti-Diagonal");

        int[][] threeMain = {
            {2, 1, 3},
            {4, 5, 6},
            {9, 8, 7}
        };
        int[][] threeAnti = {
            {2, 1, 3},
            {4, 5, 6},
            {9, 8, 7}
        };
        int[][] fourMain = {
            {2, 7, 6, 1},
            {9, 5, 1, 3},
            {4, 3, 8, 2},
            {6, 1, 2, 7}
        };
        int[][] fourAnti = {
            {2, 7, 6, 1},
            {9, 5, 1, 3},
            {4, 3, 8, 2},
            {6, 1, 2, 7}
        };

        checkInt("05-1", "mainDiagonalSum(3x3)", 14,
                Exercise05Diagonals.mainDiagonalSum(threeMain));
        checkInt("05-2", "antiDiagonalSum(3x3)", 17,
                Exercise05Diagonals.antiDiagonalSum(threeAnti));
        checkInt("05-3", "mainDiagonalSum(1x1)", 4,
                Exercise05Diagonals.mainDiagonalSum(new int[][]{{4}}));
        checkInt("05-4", "antiDiagonalSum(1x1)", 4,
                Exercise05Diagonals.antiDiagonalSum(new int[][]{{4}}));
        checkInt("05-5", "mainDiagonalSum(2x2)", 5,
                Exercise05Diagonals.mainDiagonalSum(new int[][]{{1, 9}, {3, 4}}));
        checkInt("05-6", "antiDiagonalSum(2x2)", 12,
                Exercise05Diagonals.antiDiagonalSum(new int[][]{{1, 9}, {3, 4}}));
        checkInt("05-7", "mainDiagonalSum(4x4)", 22,
                Exercise05Diagonals.mainDiagonalSum(fourMain));
        checkInt("05-8", "antiDiagonalSum(4x4)", 11,
                Exercise05Diagonals.antiDiagonalSum(fourAnti));
    }

    private static void test06() {
        startGroup(5, "Conditional Counting");

        int[][] greaterGrid = {{4, -3, 7, 0}, {10, 5, -8, 2}};
        int[][] evenGrid = {{4, -3, 7, 0}, {10, 5, -8, 2}};
        int[][] rangeGrid = {{4, -3, 7, 0}, {10, 5, -8, 2}};

        checkInt("06-1", "countGreaterThan(sample, 3)", 4,
                Exercise06ConditionalCount.countGreaterThan(greaterGrid, 3));
        checkInt("06-2", "countEven(sample)", 5,
                Exercise06ConditionalCount.countEven(evenGrid));
        checkInt("06-3", "countInRange(sample, 0, 5)", 4,
                Exercise06ConditionalCount.countInRange(rangeGrid, 0, 5));
        checkInt("06-4", "countGreaterThan(empty, 3)", 0,
                Exercise06ConditionalCount.countGreaterThan(new int[0][], 3));
        checkInt("06-5", "countEven(empty)", 0,
                Exercise06ConditionalCount.countEven(new int[0][]));
        checkInt("06-6", "countInRange(empty, 0, 5)", 0,
                Exercise06ConditionalCount.countInRange(new int[0][], 0, 5));
        checkInt("06-7", "countGreaterThan({{5}}, 5)", 0,
                Exercise06ConditionalCount.countGreaterThan(new int[][]{{5}}, 5));
        checkInt("06-8", "countInRange({{0,5,6,-1}}, 0, 5)", 2,
                Exercise06ConditionalCount.countInRange(new int[][]{{0, 5, 6, -1}}, 0, 5));
        checkInt("06-9", "countEven({{-9,-2,0,3}})", 2,
                Exercise06ConditionalCount.countEven(new int[][]{{-9, -2, 0, 3}}));
        checkInt("06-10", "countInRange({{2,2,3}}, 2, 2)", 2,
                Exercise06ConditionalCount.countInRange(new int[][]{{2, 2, 3}}, 2, 2));
        checkInt("06-11", "countInRange({{1,2,3}}, 3, 1) empty range", 0,
                Exercise06ConditionalCount.countInRange(new int[][]{{1, 2, 3}}, 3, 1));
    }

    private static void test07() {
        startGroup(6, "Transpose a Matrix");

        checkGrid("07-1", "transpose(2x3)", new int[][]{{1, 4}, {2, 5}, {3, 6}},
                Exercise07Transpose.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        checkGrid("07-2", "transpose(3x2)", new int[][]{{1, 2, 3}, {4, 5, 6}},
                Exercise07Transpose.transpose(new int[][]{{1, 4}, {2, 5}, {3, 6}}));
        checkGrid("07-3", "transpose(1x1)", new int[][]{{7}},
                Exercise07Transpose.transpose(new int[][]{{7}}));
        checkGrid("07-4", "transpose(1x3)", new int[][]{{1}, {2}, {3}},
                Exercise07Transpose.transpose(new int[][]{{1, 2, 3}}));
        checkGrid("07-5", "transpose(3x1)", new int[][]{{1, 2, 3}},
                Exercise07Transpose.transpose(new int[][]{{1}, {2}, {3}}));

        int[][] input = {{1, 2}, {3, 4}};
        int[][] result = Exercise07Transpose.transpose(input);
        checkGrid("07-6", "transpose does not modify its input", new int[][]{{1, 2}, {3, 4}}, input);
        checkBool("07-7", "transpose returns a new array, not the input", true,
                result != null && result != input);
    }

    private static void test08() {
        startGroup(7, "Symmetric Matrix");

        checkBool("08-1", "isSymmetric(3x3 symmetric)", true,
                Exercise08Symmetric.isSymmetric(new int[][]{
                    {1, 2, 3},
                    {2, 4, 5},
                    {3, 5, 6}
                }));
        checkBool("08-2", "isSymmetric(3x3 one mismatch)", false,
                Exercise08Symmetric.isSymmetric(new int[][]{
                    {1, 2, 3},
                    {2, 4, 5},
                    {9, 5, 6}
                }));
        checkBool("08-3", "isSymmetric(2x3)", false,
                Exercise08Symmetric.isSymmetric(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        checkBool("08-4", "isSymmetric(1x1)", true,
                Exercise08Symmetric.isSymmetric(new int[][]{{4}}));
        checkBool("08-5", "isSymmetric(2x2 symmetric)", true,
                Exercise08Symmetric.isSymmetric(new int[][]{{1, 2}, {2, 1}}));
        checkBool("08-6", "isSymmetric(2x2 not symmetric)", false,
                Exercise08Symmetric.isSymmetric(new int[][]{{1, 2}, {3, 4}}));
        checkBool("08-7", "isSymmetric(4x4 symmetric)", true,
                Exercise08Symmetric.isSymmetric(new int[][]{
                    {1, 2, 3, 4},
                    {2, 5, 6, 7},
                    {3, 6, 8, 9},
                    {4, 7, 9, 0}
                }));
        checkBool("08-8", "isSymmetric(3x2)", false,
                Exercise08Symmetric.isSymmetric(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
        checkBool("08-9", "isSymmetric(zero rows)", false,
                Exercise08Symmetric.isSymmetric(new int[0][]));
    }

    private static void startGroup(int index, String title) {
        currentGroup = index;
        System.out.println();
        System.out.println("--- Exercise " + (index + 1) + ": " + title
                + " (" + PLANNED[index] + " checks) ---");
    }

    private static void groupError(int index, Exception e) {
        incompleteGroups++;
        String message = e.getMessage();
        System.out.println("[ERROR] Exercise " + (index + 1) + " stopped early: "
                + e.getClass().getSimpleName() + (message == null ? "" : ": " + message));
    }

    private static void report(boolean ok, String id, String label, String detail) {
        ran[currentGroup]++;
        if (ok) {
            passed++;
            groupPassed[currentGroup]++;
            System.out.println("[PASS] " + id + "  " + label);
        } else {
            failed++;
            System.out.println("[FAIL] " + id + "  " + label + "  -> " + detail);
        }
    }

    private static void checkInt(String id, String label, int expected, int actual) {
        report(expected == actual, id, label, "expected " + expected + ", got " + actual);
    }

    private static void checkBool(String id, String label, boolean expected, boolean actual) {
        report(expected == actual, id, label, "expected " + expected + ", got " + actual);
    }

    private static void checkString(String id, String label, String expected, String actual) {
        boolean ok = expected.equals(actual);
        report(ok, id, label, "expected " + quote(expected) + ", got " + quote(actual));
    }

    private static String quote(String value) {
        if (value == null) {
            return "null";
        }
        return "\"" + value.replace("\n", "\\n").replace("\r", "\\r") + "\"";
    }

    private static void checkIntArray(String id, String label, int[] expected, int[] actual) {
        report(sameIntArray(expected, actual), id, label,
                "expected " + format(expected) + ", got " + format(actual));
    }

    private static void checkGrid(String id, String label, int[][] expected, int[][] actual) {
        report(sameGrid(expected, actual), id, label,
                "expected " + format(expected) + ", got " + format(actual));
    }

    private static boolean sameIntArray(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean sameGrid(int[][] a, int[][] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int r = 0; r < a.length; r++) {
            if (a[r] == null || b[r] == null) {
                return false;
            }
            if (a[r].length != b[r].length) {
                return false;
            }
            for (int c = 0; c < a[r].length; c++) {
                if (a[r][c] != b[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String format(int[] values) {
        if (values == null) {
            return "null";
        }
        String result = "{";
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += values[i];
        }
        return result + "}";
    }

    private static String format(int[][] grid) {
        if (grid == null) {
            return "null";
        }
        String result = "{";
        for (int r = 0; r < grid.length; r++) {
            if (r > 0) {
                result += ", ";
            }
            result += format(grid[r]);
        }
        return result + "}";
    }

    private static void printSummary() {
        System.out.println();
        System.out.println("=== Summary ===");
        for (int i = 0; i < 8; i++) {
            System.out.println("Exercise " + (i + 1) + ": " + ran[i] + "/" + PLANNED[i]
                    + " checks run, " + groupPassed[i] + " passed");
        }
        System.out.println();
        System.out.println("Total: " + (passed + failed) + "/" + TOTAL_PLANNED
                + " checks run, " + passed + " passed, " + failed + " failed");
        if (incompleteGroups > 0) {
            System.out.println("Note: " + incompleteGroups
                    + " exercise(s) stopped early because your code threw an exception.");
        }
    }
}
