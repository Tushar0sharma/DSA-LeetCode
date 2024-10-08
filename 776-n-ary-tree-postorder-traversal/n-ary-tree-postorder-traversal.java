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
        Stack<Node>s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node q=s.pop();
            l.add(0,q.val);
            for(Node r:q.children){
                s.push(r);
            }
        }
        return l;
    }
}