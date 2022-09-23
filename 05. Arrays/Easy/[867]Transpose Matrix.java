//Given a 2D integer array matrix, return the transpose of matrix. 
//
// The transpose of a matrix is the matrix flipped over its main diagonal, 
//switching the matrix's row and column indices. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 1000 
// 1 <= m * n <= 10⁵ 
// -10⁹ <= matrix[i][j] <= 10⁹ 
// 
//
// Related Topics Array Matrix Simulation 👍 2349 👎 410


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] transpose(int[][] matrix) {

        // If rows and cols are equal, then
        // [Time : O(n^2), Space : O(1)]
        // else
        // [Time : O(n^2), Space : O(rows * cols)]

        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = i; j < cols; j++) {
                    if (i == j)
                        continue;
                    swap(matrix, i, j);
                }
            }
            return matrix;
        } else {
            int[][] ans = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    ans[j][i] = matrix[i][j];
                }
            }
            return ans;
        }
    }

    public static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
