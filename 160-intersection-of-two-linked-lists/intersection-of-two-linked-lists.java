/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        while(l1!=null){
            ListNode temp=l2;
            while(temp!=null){
                if(temp==l1){
                    return l1;
                }
                temp=temp.next;
            }
            l1=l1.next;
        }
        return null;
    }
}