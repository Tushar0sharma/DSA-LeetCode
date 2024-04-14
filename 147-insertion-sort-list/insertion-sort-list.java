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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        while(head!=null){
            ListNode next=head.next;
            ListNode l=dummy;
            while(l.next!=null && l.next.val<head.val){
                l=l.next;
            }
            head.next=l.next;
            l.next=head;
            head=next;
        }
        return dummy.next;
    }
}