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
    public ListNode swapPairs(ListNode head) {
        return swap(2,head);
    }
    public ListNode swap(int k,ListNode head){
        if(check(head,k)){
            return head;
        }
        int cnt=0;
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null && cnt<k){
            cnt++;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(next!=null){
            head.next=swap(k,next);
        }
        return prev;
    }
    public boolean check(ListNode head,int k){
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
        }
        return cnt<k;
    }
}