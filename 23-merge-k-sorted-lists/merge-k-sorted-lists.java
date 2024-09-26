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
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode l:lists){
            if(l!=null)
            pq.add(l);
        }
        ListNode dummy=new ListNode();
        ListNode t=dummy;
        while(!pq.isEmpty()){
            ListNode p=pq.poll();
            dummy.next=p;
            dummy=dummy.next;
            if(p.next!=null) pq.add(p.next);
        }
        return t.next;
    }
}