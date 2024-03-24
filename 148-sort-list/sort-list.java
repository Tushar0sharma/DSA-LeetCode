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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
			return head;
		}
		
		ListNode mid = getmid (head);
		ListNode left = sortList (head);
		ListNode right = sortList (mid);
        return merge(left,right);
    }
    public ListNode merge(ListNode left,ListNode right){
        
		ListNode head = new ListNode ();
		ListNode tail = head;
		
		while (left != null && right != null) {
			if (left.val < right.val) {
				tail.next = left;
				left = left.next;
			}
			else {
				tail.next = right;
				right = right.next;
			}
			tail = tail.next;
		}
		
		tail.next = left != null ? left :right;
		return head.next;
    }
    public ListNode getmid(ListNode head){
       ListNode slow = head;
		ListNode fast = head.next;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		head = slow.next;
		slow.next = null;
		return head;
    }

}