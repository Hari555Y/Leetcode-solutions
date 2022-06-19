// https://leetcode.com/problems/n-ary-tree-level-order-traversal

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root ==null){
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int siz = q.size();
            List<Integer> ne = new ArrayList<>();
            while(siz-->0){
                Node t = q.poll();
                ne.add(t.val);
                if (t.children !=null)
                    q.addAll(t.children);   
            }
            ans.add(ne); 
        }
        
        return ans;
    }
}