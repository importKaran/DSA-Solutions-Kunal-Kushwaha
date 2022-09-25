//You are given a large integer represented as an integer array digits, where 
//each digits[i] is the iᵗʰ digit of the integer. The digits are ordered from most 
//significant to least significant in left-to-right order. The large integer does 
//not contain any leading 0's. 
//
// Increment the large integer by one and return the resulting array of digits. 
//
//
// 
// Example 1: 
//
// 
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
// 
//
// Example 2: 
//
// 
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
// 
//
// Example 3: 
//
// 
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
// 
//
// 
// Constraints: 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// digits does not contain any leading 0's. 
// 
//
// Related Topics Array Math 👍 5349 👎 4470


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {

        // [Time : O(1), if last digit is not 9, else O(n)]
        // [Space : O(n)]

        int len = digits.length;
        if(digits[len - 1] != 9) {
            digits[len - 1]++;
            return digits;
        } else {
            List<Integer> arr = new ArrayList<>();
            int carry = 1;
            for(int i = len - 1; i >= 0; i--) {
                int sum = carry + digits[i];
                if(sum > 9) {
                    carry = 1;
                    sum -= 10;
                } else
                    carry = 0;
                arr.add(0, sum);
            }
            if(carry == 1)
                arr.add(0, 1);
            int[] ans = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                ans[i] = arr.get(i);
            }
            return ans;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
