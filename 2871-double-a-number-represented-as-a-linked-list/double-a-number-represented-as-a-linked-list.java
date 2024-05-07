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
        head=rev(head);
        int carry=0;
        ListNode dummy=new ListNode (0);
        ListNode t=dummy;
        while(head!=null || carry!=0){
            int k1=0;
            if(head!=null){
                k1=head.val;
            }
            int pro=k1*2+carry;
            dummy.next=new ListNode(pro%10);
            dummy=dummy.next;
            carry=pro/10;
            if(head!=null){
                head=head.next;
            }
        }
        t=t.next;
        t=rev(t);
        return t;
    }
    public ListNode rev(ListNode head){
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