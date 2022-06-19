// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list

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
    public ListNode deleteMiddle(ListNode head) {
        if (head==null || head.next==null){
            return null;
        }
        else if (head.next.next==null){
            head.next=null;
            return head;
        }
        else{
            ListNode hare = head.next;
            ListNode tort = head;
            while(hare.next!=null && hare.next.next!=null){
                hare = hare.next.next;
                tort = tort.next;
                
            }
            tort.next = tort.next.next;
            return head;
        }
        
    }
}