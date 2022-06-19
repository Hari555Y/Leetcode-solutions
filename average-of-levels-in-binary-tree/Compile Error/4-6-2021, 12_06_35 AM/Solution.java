// https://leetcode.com/problems/average-of-levels-in-binary-tree

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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<Double> lst = new ArrayList<>();
        qu.add(root);
       // int sum =0;
        while (!qu.isEmpty()){
            int size = qu.size();
            double avg = 0.0;
            for (int i =0; i<size; i++){
                TreeNode nod = qu.poll();
                avg = avg+nod.val;
                
                if ( nod.left !=null){
                    qu.add(nod.left);
                }
                if (node.right!=null){
                    qu.add(nod.right);
                }
                 
            }
            lst.add(avg/size);
            
            
            
            
        }
        return lst;
        
    }
}