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
        ArrayList<Integer> myq = inorder(root);
        //Integer[] arr = new Integer[myq.size()];
        //int im =0;
        /*for (Integer its : myq){
            arr[im] = its;
            im++;
            
        }*/
        int i =0;  int j = myq.size()-1;
        while(i<j){
            if (myq.get(i) +myq.get(j)==k){
                return true;
            }
            if (myq.get(i) +myq.get(j)>k){
                j--;
            }
            if (myq.get(i) + myq.get(j)<k){
                i++;
            }
            
            
        }
        return false;
        
    
        
    }
    public ArrayList<Integer> inorder(TreeNode root){
        ArrayList<Integer> q = new ArrayList<Integer>();
        while(root!=null){
            q.addAll(root.left.val);
            q.add(root.val);
            q.addAll(root.right.val);
                
        }
        return q;

    }
}