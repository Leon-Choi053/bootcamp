package inclassCoding.Leetcode;

// You are given an n x n integer matrix grid.

// Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

// maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
// In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

// Return the generated matrix.

public class 2373 {
  class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] mat = new int[grid[0].length - 2][grid[0].length - 2];
        int row = 0;
        int column = 0;
        while (row + 3 <= grid.length) {
            mat[row][column] = largest(generate(grid, row, column));
            column++;
            // reset
            if (column + 3 > grid[0].length) {
                row++;
                column = 0;
            }
        }
        return mat;
    }

    public static int[][] generate(int[][] grid, int row, int col) {
        int[][] matrix = new int[3][3];
        for (int i = row; i < row + 3; i++) { // 0, 1, 2
            for (int j = col; j < col + 3; j++) { // 0, 1, 2
                matrix[i - row][j - col] = grid[i][j];
            }
        }
        return matrix;
    }

    public static int largest(int[][] grid) {
        int max = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > max)
                    max = grid[i][j];
            }
        }
        return max;
    }
}
}
