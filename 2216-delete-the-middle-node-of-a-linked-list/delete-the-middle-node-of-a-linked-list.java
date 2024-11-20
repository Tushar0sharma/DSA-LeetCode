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
        int size=0;
        ListNode t=head;
        while(t!=null){
            size++;
            t=t.next;
        }
        if(size==1) return null;
        int k=size/2;
        ListNode slow=head; 
        for(int i=0;i<k-1;i++){
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;        
    }
}