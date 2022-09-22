//You are given an array items, where each items[i] = [typei, colori, namei] 
//describes the type, color, and name of the iᵗʰ item. You are also given a rule 
//represented by two strings, ruleKey and ruleValue. 
//
// The iᵗʰ item is said to match the rule if one of the following is true: 
//
// 
// ruleKey == "type" and ruleValue == typei. 
// ruleKey == "color" and ruleValue == colori. 
// ruleKey == "name" and ruleValue == namei. 
// 
//
// Return the number of items that match the given rule. 
//
// 
// Example 1: 
//
// 
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],[
//"phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is [
//"computer","silver","lenovo"].
// 
//
// Example 2: 
//
// 
//Input: items = [["phone","blue","pixel"],["computer","silver","phone"],[
//"phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
//Output: 2
//Explanation: There are only two items matching the given rule, which are [
//"phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item [
//"computer","silver","phone"] does not match. 
//
// 
// Constraints: 
//
// 
// 1 <= items.length <= 10⁴ 
// 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10 
// ruleKey is equal to either "type", "color", or "name". 
// All strings consist only of lowercase letters. 
// 
//
// Related Topics Array String 👍 1148 👎 126


import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        // Brute Force approach, can't think of other solution
        // [Time : O(n), Space : O(1)]

        int cnt = 0, index = 0;
        if(ruleKey.equals("color"))
            index = 1;
        else if(ruleKey.equals("name"))
            index = 2;

        for(List<String> s : items) {
            if(s.get(index).equals(ruleValue))
                cnt++;
        }
//        for(int i = 0; i < items.size(); i++) {
//            if(items.get(i).get(index).equals(ruleValue))
//                cnt++;
//        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
