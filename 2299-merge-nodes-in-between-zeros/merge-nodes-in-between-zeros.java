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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        int sum=0;
        ListNode h=dummy;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val==0){
                dummy.next=new ListNode(sum);
                dummy=dummy.next;
                sum=0;
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return h.next;
    }
}