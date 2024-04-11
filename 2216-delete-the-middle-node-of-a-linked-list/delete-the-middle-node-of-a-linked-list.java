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
    public ListNode deleteMiddle(ListNode head) {
        if(length(head)==1 || length(head)==0) return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev.next!=null)
        prev.next=slow.next;
        return head;
    }
    public int length(ListNode head){
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
        }
        return cnt;
    }
}