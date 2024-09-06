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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums) s.add(i);
        ListNode dummy=new ListNode(0);
        ListNode r=dummy;
        while(head!=null){
            if(!s.contains(head.val)){
                dummy.next=new ListNode(head.val);
                dummy=dummy.next;
            }
            head=head.next;
        }
        return r.next;
    }
}