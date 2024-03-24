/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int length=0;
        while(fast !=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                length=lengthcycle(slow);
                break;
            }
        }
        if(length==0) return null;
        ListNode f=head;
        ListNode s=head;
        while(length!=0){
           s=s.next;
           length--;
        }
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return s;
    }
    public int lengthcycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        int l=0;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                ListNode temp=slow;
                do{
                    temp=temp.next;
                    l++;
                }
                while(temp!=fast);
                return l;
            }

        }
        return 0;
    }
}