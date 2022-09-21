//Given an array of integers nums, return the number of good pairs. 
//
// A pair (i, j) is called good if nums[i] == nums[j] and i < j. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,1,1,1]
//Output: 6
//Explanation: Each pair in the array are good.
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2,3]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 1 <= nums[i] <= 100 
// 
//
// Related Topics Array Hash Table Math Counting 👍 3022 👎 158


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIdenticalPairs(int[] nums) {

        // Brute force method, [Time : O(n^2), Space : O(1)]

        /*
        int cnt = 0, len = nums.length;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] == nums[j])
                    cnt++;
            }
        }
        return cnt;

         */



        // Using sorting method, [Time : O(n.log(n)), Space : O(1)]

        /*
        int cnt = 0, len = nums.length, n = 1;
        Arrays.sort(nums);
        for(int i = 0; i < len - 1; i++) {
            if(nums[i] == nums[i + 1])
                n++;
            else {
                if(n > 1)
                    cnt += (n * (n - 1)) / 2;
                n = 1;
            }
            if(n == len)
                cnt += (n * (n - 1)) / 2;
        }

        if(n != len) {
            n = 1;
            for(int i = len - 1; i >= 0; i--) {
                if(nums[i] != nums[i - 1])
                    break;
                n++;
            }
            cnt += (n * (n - 1)) / 2;
        }
        return cnt;

         */



        // Using frequency array [Time : O(n), Space : O(n)]

        int len = nums.length, cnt = 0;
        int[] freq = new int[101];

        for (int num : nums)
            freq[num]++;

        for (int n : freq) {
            if (n > 1)
                cnt += (n * (n - 1)) / 2;
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
