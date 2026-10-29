# Solutions and Explanations

Try each exercise before reading its solution. The goal is not to copy the
code but to compare your thinking with another approach.

Every solution file uses exactly the same class member names, parameter
types, and return types as its starter file. Only the class name differs
(`Solution01CreateGrid` instead of `Exercise01CreateGrid`) so that both
folders can live in the same project without a duplicate class.

## How the solutions are tested

`solutions/SolutionTestRunner.java` runs 75 checks directly against the eight
solution classes. It does not compile or import anything from `exercises/`,
so unfinished starter code cannot affect it.

```text
Exercise 1: 8 checks    Exercise 5: 8 checks
Exercise 2: 8 checks    Exercise 6: 11 checks
Exercise 3: 8 checks    Exercise 7: 7 checks
Exercise 4: 16 checks   Exercise 8: 9 checks
Total: 75 checks
```

All 75 checks must pass. The commands are in the main README.

---

## Exercise 01 - Create and Fill a 2D Array

### The idea

`new int[rows][cols]` creates the array and fills every cell with `0`.
`createGrid` then replaces each `0` with `value`. `createNumberedGrid` keeps a
counter outside the loops and assigns it in row-major order.

```java
int[][] grid = new int[rows][cols];
int next = 1;
for (int r = 0; r < grid.length; r++) {
    for (int c = 0; c < grid[r].length; c++) {
        grid[r][c] = next;
        next++;
    }
}
```

### Common mistakes

- Writing `new int[rows, cols]` (that is C#, not Java).
- Using `rows` and `cols` in the loops but forgetting that `grid.length` is
  the number of rows and `grid[0].length` is the number of columns.
- Resetting the counter inside the inner loop, so the same number repeats.

### Complexity

`O(rows * cols)` time. The result itself needs `O(rows * cols)` space.

---

## Exercise 02 - Traverse and Sum

### The idea

The output rules are easier if you add separators *before* an item instead of
after it. A newline comes before every row except the first, and a space
comes before every value except the first in its row. That automatically
avoids a trailing space and a trailing newline.

For the sum, start at `0` and add every cell. A grid with no rows never enters
the loops, so it returns `0` without a special case.

### Common mistakes

- Adding a newline after every row, which leaves a trailing `\n`.
- Adding a space after every value, which leaves a trailing space that is hard
  to see when printed.
- Using `grid[0].length` for the outer loop. The outer loop must use
  `grid.length`.
- Forgetting that `""` is the correct answer for a zero-row grid.

### Complexity

`O(rows * cols)` time. Building the string takes `O(rows * cols)` space.

---

## Exercise 03 - Row and Column Sums

### The idea

`rowSums` keeps one accumulator for the current row and stores it after the
inner loop ends. `colSums` swaps the loops: the outer loop walks over columns
and the inner loop walks over rows. Column sums can also be accumulated into a
result array while visiting each row, but the swapped-loop version makes the
column index explicit.

```java
int[] sums = new int[grid[0].length];
for (int c = 0; c < grid[0].length; c++) {
    for (int r = 0; r < grid.length; r++) {
        sums[c] += grid[r][c];
    }
}
```

### The zero-row rule

Java does not store a column count for an array created with `new int[0][5]`;
only the value `0` for the row count survives. There is no safe way to learn
that the columns "used to be" 5. Therefore `colSums` returns an array of
length `0` when `grid.length == 0`, and it must check that case before reading
`grid[0]`.

`rowSums` also returns length `0` for a zero-row grid.

### Common mistakes

- Declaring the row accumulator outside the outer loop, so all rows share one
  total.
- Reading `grid[0].length` before checking `grid.length == 0`.
- Returning `null` instead of an empty array.

### Complexity

`O(rows * cols)` time, `O(rows + cols)` extra space for the two result arrays.

---

## Exercise 04 - Maximum, Minimum and Position

### The idea

Start both searches from `grid[0][0]`, not from `0`. A grid of negative
numbers would otherwise report `0` as the maximum.

For `maxPosition`, save the location at the same time you update the best
value. Use a strict `>` comparison so that equal maxima keep the first
position in row-major order.

```java
int best = grid[0][0];
int[] position = {0, 0};
for (int r = 0; r < grid.length; r++) {
    for (int c = 0; c < grid[r].length; c++) {
        if (grid[r][c] > best) {
            best = grid[r][c];
            position[0] = r;
            position[1] = c;
        }
    }
}
```

### Common mistakes

- Initializing the best value to `0` (wrong for all-negative grids).
- Using `>=`, which reports the last of several equal maxima.
- Returning only the value when the method must return `{row, column}`.
- Swapping the saved row and column.

### Complexity

`O(rows * cols)` time, `O(1)` extra space.

---

## Exercise 05 - Main Diagonal and Anti-Diagonal

### The idea

For a square grid with `n` rows, the main diagonal cells are
`grid[0][0], grid[1][1], ...`. The anti-diagonal cells are
`grid[0][n-1], grid[1][n-2], ...`, which is `grid[i][n - 1 - i]` in a loop.
A single loop is enough for each sum.

### Common mistakes

- Using `grid[0].length` as `n` in a non-square grid. The exercise assumes a
  square grid, so `grid.length` is the correct `n`.
- Double-counting the center of an odd-sized grid. Each diagonal contains the
  center exactly once; the two sums are separate, so the center appears in
  both answers but not twice in one answer.
- Writing `n - i` instead of `n - 1 - i`, which goes out of bounds on the
  last iteration.

### Complexity

`O(n)` time for an `n x n` grid, `O(1)` extra space.

---

## Exercise 06 - Conditional Counting

### The idea

Each method is the same pattern: one counter, a nested traversal, and an `if`
that increases the counter. Use the exact comparison the problem asks for:

- strictly greater: `value > limit`
- even: `value % 2 == 0`
- inclusive range: `value >= low && value <= high`

`low > high` defines an empty range, and the exercise states that the method
must return `0` for it. The condition below is false for every value, so the
loop naturally counts nothing.

### Common mistakes

- Using `>= limit` when the problem says "greater than".
- Using `value % 2 == 1` for even numbers; negative even numbers such as `-8`
  give `0` for `% 2`, not `1`.
- Writing `low <= value <= high`, which is not valid Java.
- Forgetting that a zero-row grid must return `0` rather than crash.

### Complexity

`O(rows * cols)` time per call, `O(1)` extra space.

---

## Exercise 07 - Transpose a Matrix

### The idea

The result has the columns of the input as its rows:

```java
int rows = grid.length;
int cols = grid[0].length;
int[][] result = new int[cols][rows];
for (int r = 0; r < rows; r++) {
    for (int c = 0; c < cols; c++) {
        result[c][r] = grid[r][c];
    }
}
```

The original array is read only, never written, so it stays unchanged.

### Common mistakes

- Creating `new int[rows][cols]` instead of `new int[cols][rows]`.
- Writing `result[r][c] = grid[c][r]`, which keeps the same shape.
- Trying to transpose in place. That only works for square grids and is easy
  to get wrong; this exercise asks for a new array.
- Returning the input array after modifying it.

### Complexity

`O(rows * cols)` time, `O(rows * cols)` space for the new grid.

---

## Exercise 08 - Symmetric Matrix

### The idea

A symmetric grid must have at least one row and must be square. Return
`false` immediately for a zero-row grid. Then check that every row length
equals `grid.length`; if not, return `false` immediately. Finally, compare
`grid[r][c]` with `grid[c][r]` for every pair and return `false` on the first
mismatch. If the loops finish, the grid is symmetric.

```java
if (grid.length == 0) {
    return false;
}
for (int r = 0; r < grid.length; r++) {
    if (grid[r].length != grid.length) {
        return false;
    }
}
for (int r = 0; r < grid.length; r++) {
    for (int c = 0; c < grid.length; c++) {
        if (grid[r][c] != grid[c][r]) {
            return false;
        }
    }
}
return true;
```

### Common mistakes

- Forgetting that a zero-row grid must return `false`.
- Skipping the square check, which can cause an out-of-bounds error or a
  wrong `true`.
- Comparing only neighboring cells instead of mirrored cells.
- Checking only the upper triangle but then indexing the lower triangle
  incorrectly.
- Returning `true` as soon as one pair matches, instead of checking all pairs.

### A small optimization

The comparison only needs pairs where `c > r`, because `(r, c)` and `(c, r)`
describe the same pair. The version above checks every pair twice, which is
simpler to read and still `O(n^2)`. Either version is acceptable.

### Complexity

`O(n^2)` time for an `n x n` grid, `O(1)` extra space.
