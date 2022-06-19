// https://leetcode.com/problems/add-one-row-to-tree

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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth==1){
            Treenode newroot;
            newroot.val = val;
            newroot.left = root;
            return newroot;
            
        }
        else{
            Queue<TreeNode> qu = new ArrayList<>();
            qu.add(root);
            int d = 1;
            TreeNode fakel = root;
            TreeNode faker = root;
            while (depth-1 >d){
                TreeNode pehla = qu.peek();
                for (int i =0; i<qu.size(); i++){
                    if (pehla.left !=null){
                        qu.add(pehla.left);
                    }
                    if (pehla.right!=null){
                        qu.add(pehla.right);
                    }
                    qu.poll(pehla);
                    
                }
                d++;    
            }
            for (int h =0; h< qu.size();h++){
                TreeNode chut = qu.peek();
                if (chut.left ==null && chut.right==null){
                    Treenode ass, fuck;
                    ass.val = val;
                    fuck.val = val;
                    chut.left = ass;
                    chut.right = fuck;
                }
                else if (chut.left ==null && chut.right!=null){
                    Treenode ass, fuck;
                    ass.val = val;
                    fuck.val = val;
                    chut.left = ass;
                    fuck.right = chut.right;
                    chut.right = fuck;
                }
                if (chut.left !=null && chut.right==null){
                    Treenode ass, fuck;
                    ass.val = val;
                    fuck.val = val;
                    ass.left = chut.left;
                    chut.left = ass;
                    chut.right = fuck;
                }
                if (chut.left !=null && chut.right!=null){
                    Treenode ass, fuck;
                    ass.val = val;
                    fuck.val = val;
                    ass.left = chut.left;
                    chut.left = ass;
                    fuck.right = chut.right;
                    chut.right = fuck;
                }
            }
        }
        
    }
    
//
}