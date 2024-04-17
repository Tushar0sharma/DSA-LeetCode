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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(0);
        ListNode d=dummy;
        ListNode temp=head;
        while(head!=null && head.next!=null){
            ListNode x=gcd(head.val,head.next.val);
            System.out.print(x.val);
            ListNode g=head.next;
            head.next=x;
            x.next=g;
            head=g;
        }
        return temp;
    }
    public ListNode gcd(int l1,int l2){
        int b=Math.min(l1,l2);
        for(int i=b;i>=1;i--){
            if(l1%i==0 && l2%i==0){
                return new ListNode(i);
            }
        }
        return new ListNode(1);
    }
}