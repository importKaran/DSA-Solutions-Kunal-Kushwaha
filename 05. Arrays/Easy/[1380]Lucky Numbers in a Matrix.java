//Given an m x n matrix of distinct numbers, return all lucky numbers in the 
//matrix in any order. 
//
// A lucky number is an element of the matrix such that it is the minimum 
//element in its row and maximum in its column. 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]
//Explanation: 15 is the only lucky number since it is the minimum in its row 
//and the maximum in its column.
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//Output: [12]
//Explanation: 12 is the only lucky number since it is the minimum in its row 
//and the maximum in its column.
// 
//
// Example 3: 
//
// 
//Input: matrix = [[7,8],[1,2]]
//Output: [7]
//Explanation: 7 is the only lucky number since it is the minimum in its row 
//and the maximum in its column.
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= n, m <= 50 
// 1 <= matrix[i][j] <= 10⁵. 
// All elements in the matrix are distinct. 
// 
//
// Related Topics Array Matrix 👍 1175 👎 69


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        // [Time : O(Max(rows * rows, rows * cols)), Space : O(number of rows)]
        // For space complexity, in worst case, all rows might have one lucky number

        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < rows; i++) {
            boolean flag = true;
            int minIndex = minimum(matrix, i);
            for(int j = 0; j < rows; j++) {
                if(matrix[i][minIndex] < matrix[j][minIndex]) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                arr.add(matrix[i][minIndex]);
        }
        return arr;
    }

    int minimum(int[][] mat, int i) {

        int len = mat[i].length;
        int[] min = new int[2];
        min[0] = mat[i][0];
        for(int j = 0; j < len; j++) {
            if(min[0] > mat[i][j]) {
                min[0] = mat[i][j];
                min[1] = j;
            }
        }
        return min[1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
