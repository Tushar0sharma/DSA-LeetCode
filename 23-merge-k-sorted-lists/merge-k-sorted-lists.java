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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(ListNode l:lists){
            while(l!=null){
                pq.add(l.val);
                l=l.next;
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        while(!pq.isEmpty()){
            dummy.next=new ListNode(pq.poll());
            dummy=dummy.next;
        }
        return t.next;
    }
}