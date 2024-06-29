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
        int cnt=0;
        ListNode h=head;
        while(h!=null){
            cnt++;
            h=h.next;
        }
        h=head;
        int target=cnt-n;
        if(target==0) return head.next;
        for(int i=0;i<target-1;i++){
            h=h.next;
        }
        h.next=h.next.next;
        return head;
    }
}