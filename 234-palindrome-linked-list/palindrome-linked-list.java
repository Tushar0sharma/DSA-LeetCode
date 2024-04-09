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
        if (head == null || head.next == null) {
            return true; 
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=head;
         ListNode t=dummy;

        while(temp!=null){
            ListNode x=new ListNode(temp.val);
            dummy.next=x;
            dummy=dummy.next;
            temp=temp.next;

        }
     
        ListNode rev = reverse(head);
        ListNode first=t.next;  
        
        while (first != null) {
            if (first.val != rev.val) {
                return false; 
            }
            first = first.next;
            rev=rev.next;
        }

        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev; 
    }
}