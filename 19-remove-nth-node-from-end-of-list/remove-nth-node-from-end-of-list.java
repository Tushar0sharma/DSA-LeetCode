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
        if(head==null ) return head;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int t=c-n;
        if(t==0){
            return head.next;
        }
        temp=head;
        for(int i=0;i<t-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}