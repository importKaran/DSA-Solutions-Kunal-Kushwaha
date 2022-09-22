//Given an n x n binary matrix image, flip the image horizontally, then invert 
//it, and return the resulting image. 
//
// To flip an image horizontally means that each row of the image is reversed. 
//
// 
// For example, flipping [1,1,0] horizontally results in [0,1,1]. 
// 
//
// To invert an image means that each 0 is replaced by 1, and each 1 is 
//replaced by 0. 
//
// 
// For example, inverting [0,1,1] results in [1,0,0]. 
// 
//
// 
// Example 1: 
//
// 
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
// 
//
// Example 2: 
//
// 
//Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]
//.
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// 
//
// 
// Constraints: 
//
// 
// n == image.length 
// n == image[i].length 
// 1 <= n <= 20 
// images[i][j] is either 0 or 1. 
// 
//
// Related Topics Array Two Pointers Matrix Simulation 👍 2506 👎 210


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        // Brute force, by first reversing and then swapping, thereby repeating the iteration 2 times
        // [Time : O(n^2), Space : O(1)]

        /*

        for(int i = 0; i < image.length; i++) {
            int len = image[i].length;
            for(int j = 0; j < len / 2; j++) {
                swap(image, i, j, (len - 1 - j));
            }
        }

        for(int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = 1 - image[i][j];
            }
        }

        return image;

        */

        // Solution in one iteration, by using another array
        // [Time : O(n^2), Space : O(n^2)]

        int len = image.length;
        int[][] ans = new int[len][len];

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                ans[i][j] = 1 - image[i][len - 1 - j];
            }
        }
        return ans;
    }

    public void swap(int[][] arr, int i, int a, int b) {
        int temp = arr[i][a];
        arr[i][a] = arr[i][b];
        arr[i][b] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
