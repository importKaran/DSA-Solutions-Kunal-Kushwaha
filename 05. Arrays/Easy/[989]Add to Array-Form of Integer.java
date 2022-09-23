//The array-form of an integer num is an array representing its digits in left 
//to right order. 
//
// 
// For example, for num = 1321, the array form is [1,3,2,1]. 
// 
//
// Given num, the array-form of an integer, and an integer k, return the array-
//form of the integer num + k. 
//
// 
// Example 1: 
//
// 
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
// 
//
// Example 2: 
//
// 
//Input: num = [2,7,4], k = 181
//Output: [4,5,5]
//Explanation: 274 + 181 = 455
// 
//
// Example 3: 
//
// 
//Input: num = [2,1,5], k = 806
//Output: [1,0,2,1]
//Explanation: 215 + 806 = 1021
// 
//
// 
// Constraints: 
//
// 
// 1 <= num.length <= 10⁴ 
// 0 <= num[i] <= 9 
// num does not contain any leading zeros except for the zero itself. 
// 1 <= k <= 10⁴ 
// 
//
// Related Topics Array Math 👍 1527 👎 161


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        // Using BigInteger
        // [Time : > O(n) {Took 108 ms}, Space : O(digits)

        /*

        StringBuilder sb = new StringBuilder();
        for(int x : num)
            sb.append(x);

        BigInteger ans = new BigInteger(sb.toString());
        ans = ans.add(new BigInteger(k + ""));

        String s = ans.toString();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr.add(Integer.parseInt(c + ""));
        }

         */

        // Using carry method
        // [Time : O(digitsOfSum) {Took 10 ms}, Space : O(digitsOfSum)

        int carry = 0, index = num.length - 1;
        List<Integer> arr = new ArrayList<>();

        while(index >= 0  &&  k > 0) {
            int temp = carry + num[index] + (k % 10);
            if(temp > 9) {
                temp -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            arr.add(temp);
            index--;
            k /= 10;
        }

        while(carry != 0) {

            int temp = carry;

            if(index >= 0)
                temp += num[index--];

            if(k > 0) {
                temp += k % 10;
                k /= 10;
            }

            if(temp > 9)
                temp -= 10;
            else
                carry = 0;

            arr.add(temp);
        }

        while(index >= 0)
            arr.add(num[index--]);

        while(k > 0) {
            arr.add(k % 10);
            k /= 10;
        }

//        while(sum > 0) {
//            arr.add(sum % 10);
//            sum /= 10;
//        }
        Collections.reverse(arr);
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
