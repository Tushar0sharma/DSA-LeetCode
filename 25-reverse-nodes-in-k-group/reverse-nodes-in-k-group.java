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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(check(head,k)){
            return head;
        }
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        int cnt=0;
        while(cnt<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            cnt++;
        }
        if(next!=null){
            head.next=reverseKGroup(next,k);
        }
        return prev;
    }
    public boolean check(ListNode head,int k){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt<k;
    }
}