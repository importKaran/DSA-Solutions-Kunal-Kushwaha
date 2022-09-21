//Given an array nums of integers, return how many of them contain an even 
//number of digits. 
//
// 
// Example 1: 
//
// 
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation: 
//12 contains 2 digits (even number of digits). 
//345 contains 3 digits (odd number of digits). 
//2 contains 1 digit (odd number of digits). 
//6 contains 1 digit (odd number of digits). 
//7896 contains 4 digits (even number of digits). 
//Therefore only 12 and 7896 contain an even number of digits.
// 
//
// Example 2: 
//
// 
//Input: nums = [555,901,482,1771]
//Output: 1 
//Explanation: 
//Only 1771 contains an even number of digits.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 500 
// 1 <= nums[i] <= 10⁵ 
// 
//
// Related Topics Array 👍 1546 👎 105


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int n : nums)
            if(findDigitCount(n) % 2 == 0)
                cnt++;
        return cnt;
    }

    public static int findDigitCount(int n) {

        if(-9 <= n  &&  n <= 9)
            return 1;
        else if((-99 <= n  && n <= -10)  ||  (10 <= n  &&  n <= 99))
            return 2;
        else if((-999 <= n  && n <= -100)  ||  (100 <= n  &&  n <= 999))
            return 3;
        else if((-9999 <= n  && n <= -1000)  ||  (1000 <= n  &&  n <= 9999))
            return 4;
        else if((-99999 <= n  && n <= -10000)  ||  (10000 <= n  &&  n <= 99999))
            return 5;
        else if((-999999 <= n  && n <= -100000)  ||  (100000 <= n  &&  n <= 999999))
            return 6;
        else if((-9999999 <= n  && n <= -1000000)  ||  (1000000 <= n  &&  n <= 9999999))
            return 7;
        else if((-99999999 <= n  && n <= -10000000)  ||  (10000000 <= n  &&  n <= 99999999))
            return 8;
        else if((-999999999 <= n  && n <= -100000000)  ||  (100000000 <= n  &&  n <= 999999999))
            return 9;
//        else if((-9999999999L <= n  && n <= -1000000000L)  ||  (1000000000L <= n  &&  n <= 9999999999L))
//            return 10;
        else
            return 10; // because max int value has 10 digits only
    }
}
//leetcode submit region end(Prohibit modification and deletion)
