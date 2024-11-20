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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode mid=getmid(head);
        ListNode l=sortList(head);
        ListNode r=sortList(mid);
        return merge(l,r);
    }
    public ListNode merge(ListNode l,ListNode r){
        ListNode dummy=new ListNode(0);
        ListNode d=dummy;
        while(l!=null && r!=null){
            if(l.val>r.val){
                d.next=new ListNode(r.val);
                r=r.next;
            }
            else{
                d.next=new ListNode(l.val);
                l=l.next;
            }
            d=d.next;
        }
        d.next=l!=null?l:r;
        return dummy.next;
    }
    public ListNode getmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        head=slow.next;
        slow.next=null;
        return head;
    }
}