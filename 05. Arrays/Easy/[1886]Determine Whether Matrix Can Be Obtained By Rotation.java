//Given two n x n binary matrices mat and target, return true if it is possible 
//to make mat equal to target by rotating mat in 90-degree increments, or false 
//otherwise. 
//
// 
// Example 1: 
// 
// 
//Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
//Output: true
//Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
// 
//
// Example 2: 
// 
// 
//Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
//Output: false
//Explanation: It is impossible to make mat equal to target by rotating mat.
// 
//
// Example 3: 
// 
// 
//Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
//Output: true
//Explanation: We can rotate mat 90 degrees clockwise two times to make mat 
//equal target.
// 
//
// 
// Constraints: 
//
// 
// n == mat.length == target.length 
// n == mat[i].length == target[i].length 
// 1 <= n <= 10 
// mat[i][j] and target[i][j] are either 0 or 1. 
// 
//
// Related Topics Array Matrix 👍 913 👎 77


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean findRotation(int[][] a, int[][] target) {

        // First approach, by rotating using the described pattern
        // [Time : O(len^2), Space : O(1)]


        // Rotating by 90 degrees clockwise
        /*
//        Replace
//        a . . b       c . . a
//        . . . .  --\  . . . .
//        . . . .  --/  . . . .
//        c . . d       d . . b
//
//        . p . .       . s . .
//        . . . q  --\  . . . p
//        s . . .  --/  r . . .
//        . . r .       . . q .
//
//        . . w .       . . z .
//        z . . .  --\  y . . .
//        . . . x  --/  . . . w
//        . y . .       . x . .
        if(Arrays.deepEquals(a, target))
            return true;

        int len = a.length;
        for(int times = 0; times < 3; times++) {
            for(int i = 0; i < len / 2; i++) {
                for(int j = i; j < len - 1 - i; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[len - 1 - j][i];
                    a[len - 1 - j][i] = a[len - 1 - i][len - 1 - j];
                    a[len - 1 - i][len - 1 - j] = a[j][len - 1 - i];
                    a[j][len - 1 - i] = temp;
                }
            }
            if(Arrays.deepEquals(a, target))
                return true;
        }
        return false;
        */

        // Second approach : Transpose and then reversing each row without using extra space
        // [Time : O(len^2), Space : O(1)]

        if(Arrays.deepEquals(a, target))
            return true;

        for(int i = 0; i < 3; i++) {
            rotate(a);
            if(Arrays.deepEquals(a, target))
                return true;
        }
        return false;
    }

    void rotate(int[][] a) {

        // Transpose
        int len = a.length;
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reversing each row
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][len - 1 - j];
                a[i][len - 1 - j] = temp;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
