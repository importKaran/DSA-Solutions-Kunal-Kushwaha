//In MATLAB, there is a handy function called reshape which can reshape an m x 
//n matrix into a new one with a different size r x c keeping its original data. 
//
// You are given an m x n matrix mat and two integers r and c representing the 
//number of rows and the number of columns of the wanted reshaped matrix. 
//
// The reshaped matrix should be filled with all the elements of the original 
//matrix in the same row-traversing order as they were. 
//
// If the reshape operation with given parameters is possible and legal, output 
//the new reshaped matrix; Otherwise, output the original matrix. 
//
// 
// Example 1: 
// 
// 
//Input: mat = [[1,2],[3,4]], r = 1, c = 4
//Output: [[1,2,3,4]]
// 
//
// Example 2: 
// 
// 
//Input: mat = [[1,2],[3,4]], r = 2, c = 4
//Output: [[1,2],[3,4]]
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= m, n <= 100 
// -1000 <= mat[i][j] <= 1000 
// 1 <= r, c <= 300 
// 
//
// Related Topics Array Matrix Simulation 👍 2735 👎 311


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        // Brute force approach [Time : O(r * c), Space : O((m * n) + (r * c))

        /*
        int m = mat.length;
        int n = mat[0].length;
        if((m * n) != (r * c))
            return mat;

        int[] temp = new int[m * n];
        int cnt = 0;
        for (int[] ints : mat) {
            for (int j : ints) {
                temp[cnt++] = j;
            }
        }
        cnt = 0;
        int[][] arr = new int[r][c];
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = temp[cnt++];
            }
        }
        return arr;

         */


        // Without converting first to 1D array and then converting back into 2D array
        // [Time : O(m * n), Space : O(r * c)]

        int m = mat.length;
        int n = mat[0].length;
        if((m * n) != (r * c))
            return mat;

        int[][] arr = new int[r][c];

        // First way

//        int a = 0, b = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//
//                if(b == c) {
//                    a++;
//                    b = 0;
//                }
//                arr[a][b++] = mat[i][j];
//            }
//        }

        // Second way, using division and modulus operation as given in hints
        int x = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = mat[x / n][x % n];
                x++;
            }
        }
        return arr;

        // All these ways have same Time complexity
        // Brute force method uses (m*n) extra space for storing 1D array, which is avoided in second approach
    }
}
//leetcode submit region end(Prohibit modification and deletion)
