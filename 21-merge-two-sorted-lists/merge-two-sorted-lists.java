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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                t.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                t.next=new ListNode(l2.val);
                l2=l2.next;
            }
            t=t.next;
        }
        t.next=l1!=null?l1:l2;
        return dummy.next;
    }
}