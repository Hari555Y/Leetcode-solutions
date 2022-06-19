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
        if (head==null||head.next==null){
            return false;
        }
        HashSet<ListNode> hs = new HashSet<>();
        int i =0;ListNode temp =head;
        while(temp.next!=null){
            if (hs.contains(temp)){
                return true;
            }
            else{
                hs.add(temp);
            }
            temp = temp.next;
        }
        return false;
        
    }
}