// https://leetcode.com/problems/two-sum-iv-input-is-a-bst

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
    public boolean findTarget(TreeNode root, int k) {
        Queue myq = inorder(root);
        int[] arr = new int[myq.size()];
        int im =0;
        for (int its :myq){
            arr[im] = its;
            im++;
            
        }
        int i =0;  int j = myq.size()-1;
        while(i<j){
            if (arr[i] +arr[j]==k){
                return true;
            }
            if (arr[i] +arr[j]>k){
                j--;
            }
            if (arr[i] +arr[j]<k){
                i++;
            }
            
            
        }
        return false;
        
    
        
    }
    public Queue inorder(TreeNode root){
        Queue<int> q = new LinkedList<>();
        q.addAll(root.left.val);
        q.add(root.val);
        q.addAll(root.right.val);
        return q;
    }
}