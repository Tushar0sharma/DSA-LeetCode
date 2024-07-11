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
        ListNode dummy=new ListNode (0);
        ListNode t=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                dummy.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                dummy.next=new ListNode(l2.val);
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        dummy.next=l1==null?l2:l1;
        return t.next;
    }
}