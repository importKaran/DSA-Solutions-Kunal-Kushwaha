//Given a positive integer n, generate an n x n matrix filled with elements 
//from 1 to n² in spiral order. 
//
// 
// Example 1: 
// 
// 
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: [[1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 20 
// 
//
// Related Topics Array Matrix Simulation 👍 4206 👎 198


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {

        if(n == 1)
            return new int[][] {{1}};

        int[][] ans = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int temp = 1;

        while(top <= bottom  &&  left <= right) {

            // Adding the top row
            for(int i = left; i <= right; i++)
                ans[top][i] = temp++;
            top++;

            // Adding the right col
            for(int i = top; i <= bottom; i++)
                ans[i][right] = temp++;
            right--;

            // Adding the last row only if top <= bottom
            if (top <= bottom) {
                for(int i = right; i >= left; i--)
                    ans[bottom][i] = temp++;
                bottom--;
            }

            // Adding the left col only if left <= right
            if(left <= right) {
                for(int i = bottom; i >= top; i--)
                    ans[i][left] = temp++;
                left++;
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
