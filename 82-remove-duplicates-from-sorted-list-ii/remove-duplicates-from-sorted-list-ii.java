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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode h=dummy;
        Map<Integer,Integer>mp=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            mp.put(temp.val,mp.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(mp.get(temp.val)==1){
                dummy.next=new ListNode(temp.val);
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        return h.next;
    }
}