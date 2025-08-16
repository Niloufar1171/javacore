package com.niloufar.training.learningspring.algorithms.matrix;

import org.h2.value.ValueInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MatrixManipulation {
    //*********************************************************************************************************************************************************************************************
    public static void traversRowbyRow(int [][] matrix){
        for (int row = 0 ; row < matrix.length ; row ++){
            System.out.print("[" );
            for (int col = 0 ; col < matrix[0].length; col ++ ){ //matrix[0].length the len of each element inside the array is actually the column len , you can say also matrix[1].length ...
                System.out.print(matrix[row][col] + " ");
            }
            System.out.print("]" );
        }
    }
//*********************************************************************************************************************************************************************************************
    public static void traversColbyCol(int [][] matrix){
        for (int col = 0 ; col < matrix[0].length ; col ++){
            System.out.print("[" );
            for (int row = 0 ; row < matrix.length; row ++ ){
                System.out.print(matrix[row][col]+ " " );
            }
            System.out.print("] " );
        }
    }
    //*********************************************************************************************************************************************************************************************
    public static void traversDiagonal(int [][] matrix){
        for (int row = 0 ; row < matrix.length ; row ++){
                System.out.print(matrix[row][row] + "  ");
            }
    }
    //*********************************************************************************************************************************************************************************************
    public static void traversReveseDiagonal(int [][] matrix){
        for (int row = 0 ; row < matrix.length ; row ++){
            System.out.print(matrix[row][matrix.length - 1 - row ] + "  ");
        }
    }
    //*********************************************************************************************************************************************************************************************
    public static void TraverseSpiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;// range of rows
        int left = 0, right = matrix[0].length - 1;// crange of cols

        System.out.println("Spiral Order Traversal:");
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;

            // Traverse from right to left (only if still within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }

            // Traverse from bottom to top (only if still within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
    //*********************************************************************************************************************************************************************************************
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; ++r)
            for (int c = 0; c < matrix[0].length; ++c)
                if (r > 0 && c > 0 && matrix[r-1][c-1] != matrix[r][c])
                    return false;
        return true;
    }
        public static boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            // Start from the top-right corner
            int row = 0, col = cols - 1;

            while (row < rows && col >= 0) {
                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] > target) {
                    col--; // Move left
                } else {
                    row++; // Move down
                }
            }

            return false; // Target not foun
        }
    //*********************************************************************************************************************************************************************************************
   //Sorted matrix from left to right and top to bottom we want to find number of values that are less than a specific target
    public static int countLessThan(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;


        int row = rows -1;
        int col = 0;
        int count = 0;


        while( row >= 0 && col< cols ){
            if(matrix[row][col] < target ){
                count += row + 1;
                col ++;
            }else {
                row --;
            }

        }
        return count;
    }

    public static List<Integer> ReveseDiagnal(int[][] grid) {

        int n = grid.length;
        if (n == 0) {
            return Arrays.asList(null, null);
        }

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = grid[i][n - 1 - i]; // Access secondary diagonal element
            minVal = Math.min(minVal, val);
            maxVal = Math.max(maxVal, val);
        }

        return Arrays.asList(minVal, maxVal);
    }
//travese row bt row and return the row index when you find the target
    public static Integer findRowWithTarget(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length ; row ++){
            for (int col = 0 ; col < matrix[0].length; col ++){
                if(matrix [row][col] == target) return row;
            }
        }
        return null;
    }
    //***Search for a word in Matrix ***********************************************************************************************************************************************************************************

    private static boolean dfs(char[][] board, String word, int idx, int r, int c) {
        // All characters matched
        if (idx == word.length()) return true;

        // Out of bounds or mismatch
        if (r < 0 || r == board.length || c < 0 || c == board[0].length
                || board[r][c] != word.charAt(idx)) {
            return false;
        }

        // Mark visited
        char temp = board[r][c];
        board[r][c] = '#';

        // Explore 4 neighbours
        boolean found = dfs(board, word, idx + 1, r + 1, c) ||
                dfs(board, word, idx + 1, r - 1, c) ||
                dfs(board, word, idx + 1, r, c + 1) ||
                dfs(board, word, idx + 1, r, c - 1);

        // Restore
        board[r][c] = temp;
        return found;
    }
    public static boolean exist(char[][] board, String word) {
        if (word == null || word.isEmpty()) return true;
        if (board == null || board.length == 0 || board[0].length == 0) return false;

        int rows = board.length, cols = board[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, 0, r, c)) return true;
            }
        }
        return false;
    }
    //***Luckiest number is min in a row and max in the col ***********************************************************************************************************************
    public static List<Integer> findLuckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Step 1: Find row minimums and their column index
        for (int i = 0; i < rows; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if it's the maximum in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                result.add(rowMin);
            }
        }

        return result;
    }
    //*************************************************************************************************************************************************
    // find the maximum area rectangle in a binary matrix (0/1), we reduce the problem to finding the largest rectangle in a histogram — and we do that for each row.
    // Helper: find largest rectangle area in histogram
    private static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int[] h = new int[heights.length + 1]; // sentinel at the end
        System.arraycopy(heights, 0, h, 0, heights.length);

        for (int i = 0; i < h.length; i++) {
            while (!stack.isEmpty() && h[i] < h[stack.peek()]) {
                int height = h[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }
        return max;
    }

    // Main logic
    public static int maximalRectangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (int[] row : matrix) {
            for (int c = 0; c < cols; c++) {
                heights[c] = row[c] == 0 ? 0 : heights[c] + 1;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
//*************************************************************************************************************************************************
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(exist(board, "ABCCED")); // true
        System.out.println(exist(board, "SEE"));    // true
        System.out.println(exist(board, "ABCB"));   // false

        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}// 15 is the luckiest here
        };

        List<Integer> luckyNumbers = findLuckyNumbers(matrix);
        for (int num : luckyNumbers) {
            System.out.println(num); // Output: 15
        }
    }
}
