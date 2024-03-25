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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode l=head;
        ListNode r=head;
        ListNode first=head;
        ListNode sec=head;
        
        for(int i=0;i<k-1;i++){
            r=r.next;
        }
        sec=r;

        while(r.next!=null){
           l=l.next;
           r=r.next;
        }

        int temp=l.val;
        l.val=sec.val;
        sec.val=temp;
        return head;
    }
}