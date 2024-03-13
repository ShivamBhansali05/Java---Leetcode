/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true

Example 2:
Input: x = -121
Output: false

Example 3:
Input: x = 10
Output: false 
 */

 class Palindrome_Number {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        
        while(org > 0){
            int unit = org%10;
            rev = 10*rev+unit;
            org/=10;
        }
        
        return rev == x;
    }
}