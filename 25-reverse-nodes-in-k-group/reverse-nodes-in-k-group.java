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
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;

        int cnt=0;
        
        while(curr!=null && cnt<k){
            cnt++;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        if(next!=null){
            ListNode temp=reverseKGroup(next,k);
            head.next=temp;
        }

        return prev;
    }
    public boolean check(ListNode head,int k){
        ListNode st=head;
        int size=0;
        while(st!=null){
            st=st.next;
            size++;
        }
        return size<k;
    }
}