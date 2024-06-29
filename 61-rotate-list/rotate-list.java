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
        int n=len(head);
        if(head==null || head.next==null) return head;
        k%=n;
        if(k==n || k==0) return head;
        ListNode slow=head;
        int pos=n-k-1;
        while(pos-->0){
            slow=slow.next;
        } 
        ListNode newh=slow.next;
        slow.next=null;
        slow=newh;
        while(slow.next!=null){
            slow=slow.next;
        }
        slow.next=head;
        return newh;
    }
    public int len(ListNode head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}