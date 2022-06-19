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
        int i =0;
        while(head.next!=null){
            if (hs.contains(i)){
                return false;
            }
            else{
                hs.add(i)
            }
            i+=
        }
        
    }
}