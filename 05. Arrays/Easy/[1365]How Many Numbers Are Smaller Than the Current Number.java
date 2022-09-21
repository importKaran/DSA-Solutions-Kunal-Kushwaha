//Given the array nums, for each nums[i] find out how many numbers in the array 
//are smaller than it. That is, for each nums[i] you have to count the number of 
//valid j's such that j != i and nums[j] < nums[i]. 
//
// Return the answer in an array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation: 
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1). 
//For nums[3]=2 there exist one smaller number than it (1). 
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
// 
//
// Example 2: 
//
// 
//Input: nums = [6,5,4,8]
//Output: [2,1,0,3]
// 
//
// Example 3: 
//
// 
//Input: nums = [7,7,7,7]
//Output: [0,0,0,0]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 500 
// 0 <= nums[i] <= 100 
// 
//
// Related Topics Array Hash Table Sorting Counting 👍 3818 👎 75


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // Brute force method [Time : O(n^2), Space : O(n)]

        /*

        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 0; i < len; i++) {
            int cnt = 0;
            for(int j = 0; j < len; j++) {
                if(nums[i] > nums[j])
                    cnt++;
            }
            ans[i] = cnt;
        }
        return ans;

         */


        // Optimized approach, using frequency array method [Time : O(n), Space : O(n)]

        int len = nums.length;
        int[] ans = new int[len];
        int[] freq = new int[101];
        for(int num : nums)
            freq[num]++;
        for(int i = 1; i < 101; i++)
            freq[i] += freq[i - 1];
        for(int i = 0; i < len; i++) {
            if(nums[i] == 0)
                ans[i] = 0;
            else
                ans[i] = freq[nums[i] - 1];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
