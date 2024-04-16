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
        if(head==null || head.next==null) return head;
        ListNode t=head;
        int cnt=0;
        while(t!=null){
            cnt++;
            t=t.next;
        }
        t=head;
        k=k%cnt;
        int pos=cnt-k;
        if(pos==0 || pos==cnt){
            return head;
        }
        else{
            ListNode l1=head;
            for(int i=0;i<pos-1;i++){
                l1=l1.next;
            }
            ListNode temp=l1.next;
            l1.next=null;
            ListNode l2=temp;
            while(l2.next!=null){
                l2=l2.next;
            }
            l2.next=head;
            return temp;
        }
    }
}