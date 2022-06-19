// https://leetcode.com/problems/leaf-similar-trees

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 =  new ArrayList<>();
        inorder(root1, arr);
        inorder(root2, arr1);
        return arr1.equals(arr);
        
        
    }
    public static void inorder(TreeNode ans, ArrayList<Integer> arr){
        if(ans == null){
            return;
        }
        inorder(ans.left, new ArrayList<Integer>(arr));
        if(ans.left==null && ans.right ==null){
            arr.add(ans.val);
        }
        inorder(ans.right , new ArrayList<Integer>(arr));
        
    }
}