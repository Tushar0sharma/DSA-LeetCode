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
    public int pairSum(ListNode head) {
        ListNode mid=getMid(head);
        Stack<Integer>s=new Stack<>();
        while(mid!=null){
            s.push(mid.val);
            mid=mid.next;
        }
        int max=0;
        ListNode temp=head;
        while(!s.isEmpty()){
            int x=s.pop();
            int sum=temp.val+x;
            max=Math.max(max,sum);
            temp=temp.next;
        }
        return max;        
    }
    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}