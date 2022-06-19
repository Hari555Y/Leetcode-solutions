// https://leetcode.com/problems/kth-smallest-element-in-a-bst

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode A, int k) {
        Stack<TreeNode> st = new Stack<>();
        while(A!=null){
            st.push(A);
            A = A.left;
            
        }
        while(!st.isEmpty()){
            TreeNode p = st.pop();
            k--;
            if (k==0){
                return p.val;
                
            }
            if(p.right !=null){
                TreeNode s = p.right;
                while(s!=null){
                    st.push(s);
                    s = s.left; 
                }
            }
        }
        return -1;
    }
}