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
        HashSet<Integer> hs = new HashSet<>();
        int i =0;ListNode temp =head;
        while(head.next!=null){
            if (hs.contains(temp.val)){
                return true;
            }
            else{
                hs.add(temp.val);
            }
            temp = temp.next;
        }
        return false;
        
    }
}