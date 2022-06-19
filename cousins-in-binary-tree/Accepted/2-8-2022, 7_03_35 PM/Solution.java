// https://leetcode.com/problems/cousins-in-binary-tree

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
    static int[] arr = new int[101];
    static int[] arr1 = new int[101];
    public boolean isCousins(TreeNode root, int x, int y) {
        Arrays.fill(arr, -1); 
        bfs(root);
        return (arr[x] == arr[y])&&(arr1[x] != arr1[y]);
    }
    public static void bfs(TreeNode ans){
        Queue<TreeNode> q = new LinkedList<>();
        int depth = 0;
        q.add(ans);
        while(q.size()>0){
            int p = q.size();
            for(int i=0; i<p; i++){
                TreeNode x = q.poll();
                arr[x.val] = depth;
                if(x.left!=null){
                    q.add(x.left);
                    arr1[x.left.val] = x.val;
                }
                if(x.right!=null){
                    q.add(x.right);
                    arr1[x.right.val] = x.val;
                }
            }
            depth++;
            
        }
        
        
    }
}