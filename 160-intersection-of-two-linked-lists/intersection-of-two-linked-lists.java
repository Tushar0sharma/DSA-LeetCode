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
        Set<ListNode>mp=new HashSet<>();
        while(l1!=null){
            mp.add(l1);
            l1=l1.next;
        }
        while(l2!=null){
            if(mp.contains(l2)){
                return l2;
            }
            
            l2=l2.next;     
        }
        return null;
    }
}