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
    public boolean isPalindrome(ListNode head) {
        // ListNode temp=head;
        ListNode t=call(head);
        while(t!=null && head!=null){
            if(t.val!=head.val){
                 return false;
            }
            t=t.next;
            head=head.next;
        }
        return true;
    }
    public ListNode call(ListNode node){
        ListNode head = null;
        while (node != null) {
            ListNode newNode = new ListNode(node.val);  
            newNode.next = head;
            head = newNode;
            node = node.next;
        }
        return head;
    }
}