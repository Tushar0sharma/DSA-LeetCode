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
    public ListNode doubleIt(ListNode head) {
        int carry=0;
        ListNode dummy=new ListNode (0);
        ListNode t=dummy;
        head=rev(head);
        while(head!=null){
            int n=head.val*2+carry;
            dummy.next=new ListNode(n%10);
            carry=n/10;
            dummy=dummy.next;
            head=head.next;
        }
        if(carry!=0){
            dummy.next=new ListNode(carry);
        }
        t=rev(t.next);
        return t;
    }
    public ListNode rev(ListNode head ){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}