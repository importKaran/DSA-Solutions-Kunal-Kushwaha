//There is an m x n matrix that is initialized to all 0's. There is also a 2D 
//array indices where each indices[i] = [ri, ci] represents a 0-indexed location to 
//perform some increment operations on the matrix. 
//
// For each location indices[i], do both of the following: 
//
// 
// Increment all the cells on row ri. 
// Increment all the cells on column ci. 
// 
//
// Given m, n, and indices, return the number of odd-valued cells in the matrix 
//after applying the increment to all locations in indices. 
//
// 
// Example 1: 
// 
// 
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
// 
//
// Example 2: 
// 
// 
//Input: m = 2, n = 2, indices = [[1,1],[0,0]]
//Output: 0
//Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the 
//final matrix.
// 
//
// 
// Constraints: 
//
// 
// 1 <= m, n <= 50 
// 1 <= indices.length <= 100 
// 0 <= ri < m 
// 0 <= ci < n 
// 
//
// 
// Follow up: Could you solve this in O(n + m + indices.length) time with only 
//O(n + m) extra space? 
//
// Related Topics Array Math Simulation 👍 856 👎 1230


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        // Brute force method [Time : O(indices.length * (m + n)), Space : O(m * n)]

        /*

        int cnt = 0;
        int[][] arr = new int[m][n];

        for (int[] ints : indices) {

            int x = ints[0];
            int y = ints[1];

            // incrementing the row

            for (int j = 0; j < n; j++) {
                arr[x][j]++;
            }

            // incrementing the column

            for (int j = 0; j < m; j++) {
                arr[j][y]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] % 2 == 1)
                    cnt++;
            }
        }
        return cnt;

         */


        // Incrementing all rows and columns once by accumulating which indices needs to be incremented how many times
        // [Time : O(indices.length + (m * n)), Space : O(m + n)

        /*

        int ans = 0;
        int max = Math.max(n, m);
        int[][] cnt = new int[2][max];
        int[][] arr = new int[m][n];

        for (int[] index : indices) {
            int x = index[0];
            int y = index[1];
            cnt[0][x]++;
            cnt[1][y]++;
        }

        for(int i = 0; i < 2; i++) {

            if(i == 0) {
                for (int j = 0; j < m; j++) {
                    if(cnt[0][j] > 0) {
                        for (int k = 0; k < n; k++) {
                            arr[j][k] += cnt[0][j];
                        }
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if(cnt[1][j] > 0) {
                        for (int k = 0; k < m; k++) {
                            arr[k][j] += cnt[1][j];
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] % 2 == 1)
                    ans++;
            }
        }

        return ans;

         */


        // Best solution, using XOR [Time : O(Max(indices.length, m, n)), Space : O(n + m)]

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int[] index : indices) {
            row[index[0]] ^= true;
            col[index[1]] ^= true;
        }

        int r = 0, c = 0;
        for(boolean b : row)
            if(b)
                r++;
        for(boolean b : col)
            if(b)
                c++;

        return (r * n) + (c * m) - (2 * r * c);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
