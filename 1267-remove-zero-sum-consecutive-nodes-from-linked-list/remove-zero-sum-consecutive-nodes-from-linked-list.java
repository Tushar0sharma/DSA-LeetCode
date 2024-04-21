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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode start=new ListNode(0,head);
        ListNode front=start;
        while(start!=null){
            int pre=0;
            ListNode end=start.next;
            while(end!=null){
                pre+=end.val;
                if(pre==0){
                    start.next=end.next;
                }
                end=end.next;
            }
            start=start.next;
        }
        return front.next;
    }
}