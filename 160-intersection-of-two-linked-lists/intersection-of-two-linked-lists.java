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
        ListNode temp1=l1;
        ListNode temp2=l2;
        int s1=0;
        int s2=0;
        while(temp1!=null){
            s1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            s2++;
            temp2=temp2.next;
        }
        temp1=l1;
        temp2=l2;
        if(s1>s2){
            int n=s1-s2;
            while(n-->0){
                temp1=temp1.next;
            }
        }
        else{
            int n=s2-s1;
            while(n-->0){
                temp2=temp2.next;
            } 
        }
        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
    }
}