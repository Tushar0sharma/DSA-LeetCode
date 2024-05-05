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
        Node temp=head;
        Node copy;
        while(temp!=null){
            Node next=temp.next;
            copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=next;
        }
        temp=head;
        while(temp!=null){
            copy=temp.next;
            if(temp.random!=null){
                copy.random=temp.random.next;
            }
            else{
                copy.random=null;
            }
            temp=temp.next.next;
        }
        temp=head;
        Node dummy=new Node(-1);
        Node t=dummy;
        while(temp!=null){
            t.next=temp.next;
            temp.next=temp.next.next;
            t=t.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}