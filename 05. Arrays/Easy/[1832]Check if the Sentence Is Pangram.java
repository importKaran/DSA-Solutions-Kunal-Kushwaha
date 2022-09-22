//A pangram is a sentence where every letter of the English alphabet appears at 
//least once. 
//
// Given a string sentence containing only lowercase English letters, return 
//true if sentence is a pangram, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English 
//alphabet.
// 
//
// Example 2: 
//
// 
//Input: sentence = "leetcode"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= sentence.length <= 1000 
// sentence consists of lowercase English letters. 
// 
//
// Related Topics Hash Table String 👍 1026 👎 23


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfPangram(String sentence) {

        // Brute force approach [Time : O(n), Space : O(1)]

        /*
        int len = sentence.length();
        if(len < 26)
            return false;
        int[] freq = new int[26];
        for(int i = 0; i < len; i++) {
            char c = sentence.charAt(i);
            freq[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] == 0)
                return false;
        }
        return true;

         */


        // Optimized solution, without creating frequency array [Time : O(n), Space : O(1)]
        String s = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++) {
            if(sentence.indexOf((s.charAt(i))) == -1)
                return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
