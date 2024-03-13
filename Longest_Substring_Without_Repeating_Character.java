/*
 *Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3

Example 2:
Input: s = "bbbbb"
Output: 1

Example 3:
Input: s = "pwwkew"
Output: 3
 */

 import java.util.*;
class Longest_Substring_Without_Repeating_Character {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet < Character > hash = new HashSet < Character >();
        int i=0;
        int j=0;
        while(i<s.length() && j<s.length()){
            if(hash.contains(s.charAt(j))){
                hash.remove(s.charAt(i));
                i = i+1;
            }
            else{
                hash.add(s.charAt(j));
                j = j+1;
                max = Math.max(j-i,max);
            }
        }
        return max;
    }
}