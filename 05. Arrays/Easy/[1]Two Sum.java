//Given an array of integers nums and an integer target, return indices of the 
//two numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may 
//not use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// Only one valid answer exists. 
// 
//
// 
//Follow-up: Can you come up with an algorithm that is less than 
//O(n²) time complexity?
//
// Related Topics Array Hash Table 👍 37776 👎 1206


import java.util.Arrays;
import java.util.Comparator;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Brute force method [O(n^2)]
        /*

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }

        return new int[] {0, 0};

         */

        // Using merge sort and 2 pointer [O(n.log(n))]
        int[][] temp = new int[2][nums.length];
        for(int i = 0; i < nums.length; i++) {
            temp[0][i] = nums[i];
            temp[1][i] = i;
        }

        sortByFirstRow(temp);
        int left = 0, right = nums.length - 1;

        while(left < nums.length  &&  left < right) {
            int sum = temp[0][left] + temp[0][right];
            if(sum == target) {
                return new int[]{temp[1][left], temp[1][right]};
            }
            if(sum < target)
                left++;
            if(sum > target)
                right--;
        }
        return null;
    }

    public static void sortByFirstRow(int[][] a) {
        mergeSort(a, 0, a[0].length - 1);
    }

    public static void merge(int[][] arr, int left, int middle, int right)
    {
        int low = middle - left + 1;
        int high = right - middle;

        int[][] L = new int[2][low];
        int[][] R = new int[2][high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++)
        {
            L[0][i] = arr[0][left + i];
            L[1][i] = arr[1][left + i];
        }
        for (j = 0; j < high; j++)
        {
            R[0][j] = arr[0][middle + 1 + j];
            R[1][j] = arr[1][middle + 1 + j];
        }


        int k = left;
        i = 0;
        j = 0;

        while (i < low && j < high)
        {
            if (L[0][i] <= R[0][j])
            {
                arr[0][k] = L[0][i];
                arr[1][k] = L[1][i];
                i++;
            }
            else
            {
                arr[0][k] = R[0][j];
                arr[1][k] = R[1][j];
                j++;
            }
            k++;
        }

        while (i < low)
        {
            arr[0][k] = L[0][i];
            arr[1][k] = L[1][i];
            i++;
            k++;
        }

        while (j < high)
        {
            arr[0][k] = R[0][j];
            arr[1][k] = R[1][j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int[][] arr, int left, int right)
    {
        int middle;
        if (left < right) {
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
