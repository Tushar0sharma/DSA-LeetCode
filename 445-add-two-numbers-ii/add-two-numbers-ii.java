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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       l1=rev(l1);
       l2=rev(l2);
       int carry=0;
       ListNode dummy=new ListNode(0);
       ListNode h=dummy;
       while(l1!=null || l2!=null || carry!=0)   
       {
        int k1=0;
        int k2=0;
        if(l1!=null) k1=l1.val;
        if(l2!=null) k2=l2.val;
        int sum=k1+k2+carry;
        dummy.next=new ListNode(sum%10);
        dummy=dummy.next;
        carry=sum/10;
        if(l1!=null) l1=l1.next;
        if(l2!=null) l2=l2.next;
       }
       h=h.next;
       h=rev(h);
       return h;
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