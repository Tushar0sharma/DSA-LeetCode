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
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode right=new ListNode(0);
        ListNode l1=left;
        ListNode l2=right;
        while(head!=null){
            if(head.val<x){
                left.next=new ListNode(head.val);
                left=left.next;
            }
            else{
                right.next=new ListNode(head.val);
                right=right.next;
            }
            head=head.next;
        }
        right.next=null;
        left.next=l2.next;
        return l1.next;
    }
}