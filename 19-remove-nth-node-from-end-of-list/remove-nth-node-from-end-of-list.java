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
        int size=0;
        ListNode t=head;
        while(t!=null){
            size++;
            t=t.next;
        }
        int k=size-n-1;
        ListNode slow=head;
        if(k<0) return slow.next;
        for(int i=0;i<k;i++){
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}