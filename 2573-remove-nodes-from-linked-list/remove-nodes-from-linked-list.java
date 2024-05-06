/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        head=rev(head);
        head=lessnode(head);
        head=rev(head);
        return head;
    }
    public ListNode lessnode(ListNode curr){
        ListNode h=curr;
        int max=h.val;
        while(h.next!=null){
            if( h.next.val<max){
                h.next=h.next.next;
            }
            else{
                h=h.next;
                max=h.val;
            }
        }
        return curr;
    }
    public ListNode rev(ListNode h){
        ListNode prev=null;
        while(h!=null){
            ListNode next=h.next;
            h.next=prev;
            prev=h;
            h=next;
        }
        return prev;
    }
}