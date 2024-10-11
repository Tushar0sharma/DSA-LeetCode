/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode d = new ListNode();
        ListNode ans=d;
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for (ListNode l : lists) {
            if (l != null)
                pq.add(l);
        }
        while(!pq.isEmpty()){
            ListNode p=pq.poll();
            d.next=p;
            d=d.next;
            if(p.next!=null) pq.add(p.next);
        }
        return ans.next;        
    }
}