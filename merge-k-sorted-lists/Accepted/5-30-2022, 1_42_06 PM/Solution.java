// https://leetcode.com/problems/merge-k-sorted-lists

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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length ==0){
            return null;
        }
        ListNode dummy = new ListNode(-1); ListNode temp = dummy;
        Queue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        } );
        for (ListNode r : lists){
            if(r!=null)
                pq.add(r);
            
        }
        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            ListNode fori = new ListNode(curr.val);
            temp.next = fori;
            temp = temp.next;
            if (curr.next !=null){
                pq.add(curr.next);
            }
        }
        return dummy.next;
        
    }
}