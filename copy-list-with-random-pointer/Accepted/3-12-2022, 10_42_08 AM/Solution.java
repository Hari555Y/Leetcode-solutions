// https://leetcode.com/problems/copy-list-with-random-pointer

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hash = new HashMap<>();
        Node finalhead = head;
        while(head!=null){
            hash.put(head, new Node(head.val));
            head = head.next;
        }
        for(Node x: hash.keySet()){
            hash.get(x).next= hash.get(x.next);
            hash.get(x).random = hash.get(x.random);
        }
        return hash.get(finalhead);
    }
}