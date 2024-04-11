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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode l=dummy;
        ListNode temp=head;
        boolean skip=true;
        while(temp!=null){
            if(skip){
                dummy.next=new ListNode(temp.val);
                dummy=dummy.next;
            }
            skip=!skip;
            temp=temp.next;
        }
        temp=head;
        boolean slip=false;
        while(temp!=null){
            if(slip){
                dummy.next=new ListNode(temp.val);
                dummy=dummy.next;
            }
            slip=!slip;
            temp=temp.next;
        }
        return l.next;
    }
}