// https://leetcode.com/problems/next-greater-node-in-linked-list

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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode dummy = head;
        int l =0;
        while(dummy!=null){
            dummy= dummy.next;
            l++;
        }
        int[] ans = new int[l];
        int m =0;
        System.out.println(l);
     //   int i =1;
        while(head!=null){
            int i =1;
            while (!st.isEmpty() && st.peek()<head.val){
                if(ans[m-i]==0){
                    ans[m-i] = head.val;
                System.out.println(head.val);
                st.pop();}
                i++;
                
            }
            st.push(head.val);
            head = head.next;
            m++;
        }
        return ans;
    }
}