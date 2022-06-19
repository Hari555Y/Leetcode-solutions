// https://leetcode.com/problems/n-ary-tree-preorder-traversal

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
    public List<Integer> preorder(Node root) {
        List<Integer> ls = new ArrayList<>();
        func(ls, root);
        return ls;
        
        
    }
    public static void func(List<Integer> ans, Node root){
        if (root ==null){
            return;
        }
        ans.add(root.val);
        for (Node x : root.children){
            func(ans , x);
        }
    }
}