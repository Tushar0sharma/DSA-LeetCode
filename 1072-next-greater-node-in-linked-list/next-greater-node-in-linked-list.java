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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int[]arr=new int[ListLength(head)];
        int i=0;
        while(temp!=null){
            arr[i++]=findlarge(temp,temp.val);
            temp=temp.next;
        }
        return arr;
    }
    public int findlarge(ListNode head,int value){
        int large=0;
        while(head!=null){
            if(head.val>value){
                large=head.val;
                break;
            }
            head=head.next;
        }
        return large;
    }
    public int ListLength(ListNode head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}