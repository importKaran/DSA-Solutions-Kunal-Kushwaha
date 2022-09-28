//Given an m x n matrix, return all elements of the matrix in spiral order. 
//
// 
// Example 1: 
// 
// 
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
// 
//
// Example 2: 
// 
// 
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100 
// 
//
// Related Topics Array Matrix Simulation 👍 9011 👎 923


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // First approach, using extra space required to store the visited array
        // [Time : O(rows * cols), Space : O(rows * cols)]

        /*

        List<Integer> arr = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1  &&  cols == 1) {
            arr.add(matrix[0][0]);
            return arr;
        }

        if(rows == 1) {
            for(int i = 0; i < cols; i++)
                arr.add(matrix[0][i]);
            return arr;
        }

        if(cols == 1) {
            for(int i = 0; i < rows; i++)
                arr.add(matrix[i][0]);
            return arr;
        }

        boolean[][] visited = new boolean[rows][cols];
        int startRow = 0, startCol = 0, endRow = rows - 1, endCol = cols - 1;

        while(startRow <= endRow  &&  startCol <= endCol) {

            // Printing first row, of the remaining rows
            int temp = startCol;
            while(temp <= endCol) {
                if(!visited[startRow][temp]) {
                    arr.add(matrix[startRow][temp]);
                    visited[startRow][temp] = true;
                }
                temp++;
            }
            startRow++;

            // Printing the last column, of the remaining cols
            temp = startRow;
            while(temp <= endRow) {
                if(!visited[temp][endCol]) {
                    arr.add(matrix[temp][endCol]);
                    visited[temp][endCol] = true;
                }
                temp++;
            }
            endCol--;

            // Printing the last row, of the remaining rows
            temp = endCol;
            while(temp >= startCol) {
                if(!visited[endRow][temp]) {
                    arr.add(matrix[endRow][temp]);
                    visited[endRow][temp] = true;
                }
                temp--;
            }
            endRow--;

            // Printing the first column, of the remaining cols
            temp = endRow;
            while(temp >= startRow) {
                if(!visited[temp][startCol]) {
                    arr.add(matrix[temp][startCol]);
                    visited[temp][startCol] = true;
                }
                temp--;
            }
            startCol++;
        }
        return arr;

         */


        // Second approach, without using extra space for visited array
        // [Time : O(rows * cols), Space : O(rows * cols)

        List<Integer> arr = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while(top <= bottom  &&  left <= right) {

            // Adding top row
            for(int i = left; i <= right; i++)
                arr.add(matrix[top][i]);
            top++;

            // Adding right col
            for(int i = top; i <= bottom; i++)
                arr.add(matrix[i][right]);
            right--;

            // Adding bottom row
            if(top <= bottom) {
                for (int i = right; i >= left; i--)
                    arr.add(matrix[bottom][i]);
                bottom--;
            }

            // Adding left col
            if(left <= right) {
                for (int i = bottom; i >= top; i--)
                    arr.add(matrix[i][left]);
                left++;
            }
        }

        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
