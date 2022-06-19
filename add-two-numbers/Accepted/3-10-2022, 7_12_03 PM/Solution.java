// https://leetcode.com/problems/add-two-numbers

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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp= new ListNode(-1);
        ListNode ans = temp;
        int carry = 0;
        while(l1!=null || l2!=null || carry !=0){
            int sum = carry;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                 l2 = l2.next;
            }
          //  System.out.println(sum);
            carry = sum/10;
            ListNode nex= new ListNode(sum%10);
            temp.next = nex;
            temp = temp.next;   
          //  l1 = l1.next;
            //l2 = l2.next;
        }     
        return ans.next; 
    }
}