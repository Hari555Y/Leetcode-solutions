// https://leetcode.com/problems/linked-list-cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head.next == null){
            return false;
        }
        ListNode curr = head;
        ListNode hare = head.next.next;
        ListNode tort = head.next;
        while (curr.next.next != null){
            if (hare == tort){
                return true;
            }
            hare = hare.next.next;
            tort = tort.next;
            curr = curr.next;
            
            
        }
        return false;
        
        
    }
}