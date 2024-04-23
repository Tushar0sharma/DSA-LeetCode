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
    public ListNode rotateRight(ListNode head, int k) {
        int n=length(head);
        if(head==null || head.next==null) return head;
        k=k%n;
        if(k==n || k==0) return head;
        int pos=n-k-1;
            ListNode second=head;
            while(pos-->0){
                second=second.next;
            }
            ListNode temp=second.next;
            second.next=null;
            second=temp;
            while(second.next!=null){
                second=second.next; 
            }
            second.next=head;
        return temp;
    }
    public int length(ListNode head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}