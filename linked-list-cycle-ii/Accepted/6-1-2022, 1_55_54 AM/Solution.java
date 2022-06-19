// https://leetcode.com/problems/linked-list-cycle-ii

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
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hash = new HashSet<>();
        while(head!=null){
            if (hash.contains(head)){
                return head;
            }
            hash.add(head);
            head = head.next;
        }
        return null;
    }
}