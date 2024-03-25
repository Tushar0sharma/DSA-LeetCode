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
    public void reorderList(ListNode head) {
        if(head==null) return ;
       ListNode mid=getmid(head);
       ListNode rev=reverse(mid);

       ListNode p=head;
       while(p!=null && rev!=null){
        ListNode temp=p.next;
        p.next=rev;
        p=temp;

        temp=rev.next;
        rev.next=p;
        rev=temp;
       }
       if(p!=null) p.next=null;

    }
    public ListNode getmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
         return slow;
    }
    public ListNode reverse(ListNode head){
         ListNode prev=null;
         ListNode curr=head;
         while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         return prev;
    }
}