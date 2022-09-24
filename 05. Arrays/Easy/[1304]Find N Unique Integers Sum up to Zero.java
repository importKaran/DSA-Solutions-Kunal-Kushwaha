//Given an integer n, return any array containing n unique integers such that 
//they add up to 0. 
//
// 
// Example 1: 
//
// 
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: [-1,0,1]
// 
//
// Example 3: 
//
// 
//Input: n = 1
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 1000 
// 
//
// Related Topics Array Math 👍 1380 👎 507


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumZero(int n) {

        // [Time : O(n), Space : O(n)]

        if(n == 1)
            return new int[] {0};
        else {
            int[] a = new int[n];
            if(n % 2 == 0) {
                int temp = 1;
                for(int i = 0; i < n; i += 2) {
                    a[i] = temp;
                    a[i + 1] = -temp;
                    temp++;
                }
            } else {
                int temp = 1;
                a[0] = 0;
                for(int i = 1; i < n; i += 2) {
                    a[i] = temp;
                    a[i + 1] = -temp;
                    temp++;
                }
            }
            return a;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
