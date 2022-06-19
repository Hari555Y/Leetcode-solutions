// https://leetcode.com/problems/n-ary-tree-postorder-traversal

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
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        func(ans, root);
        return ans;
        
        
    }
    public static void func(List<Integer> ans, Node root){
        if (root ==null){
            return;
        }
        for (Node x : root.children){
            func(ans , x);
        }
        ans.add(root.val);
    }
}