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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
      dummy.next=head;
     ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<=n;i++){
            slow=slow.next;
        }
        while(slow!=null){
            fast=fast.next;
            slow=slow.next;
        }
        // if(fast.next!=null)
        fast.next=fast.next.next;
        return dummy.next;
    }
}