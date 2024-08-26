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
        List<Integer>l=new ArrayList<>();
        if(root==null) return l;
        call(root,l);
        l.add(root.val);
        return l;
    }
    public void call(Node root,List<Integer>l){
        if(root==null) return ;
        for(Node r:root.children){
            call(r,l);
            l.add(r.val);
        }
    }
}