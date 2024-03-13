/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */


 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }
        
        ListNode result = new ListNode();
        ListNode ans = result;
        int carry=0;
        while(l1 != null && l2 != null){
            
            int sum = carry + l1.val + l2.val;
            int digit = sum%10;
            carry = sum/10;
            
            l1 = l1.next;
            l2 = l2.next;
            
           result.next = new ListNode(digit);   
            result = result.next;
        }
        
        while(l1 != null){
            int sum = carry + l1.val;
            int digit = sum%10;
            carry = sum/10;
            result.next = new ListNode(digit);
            l1 = l1.next;
            result = result.next;
        } 
        
        while(l2 != null){
            int sum = carry + l2.val;
            int digit = sum%10;
            carry = sum/10;
            result.next = new ListNode(digit);
            l2 = l2.next;
            result = result.next;
        } 
        
        if(carry != 0){
            result.next = new ListNode(carry);
        }
        
        return ans.next;
    }
}
