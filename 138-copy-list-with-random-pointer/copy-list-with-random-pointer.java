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
        Map<Node,Node>mp=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            Node newnode=new Node(temp.val);
            mp.put(temp,newnode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node copy=mp.get(temp);
            copy.next=mp.get(temp.next);
            copy.random=mp.get(temp.random);
            temp=temp.next;
        }
        return mp.get(head);
    }
}