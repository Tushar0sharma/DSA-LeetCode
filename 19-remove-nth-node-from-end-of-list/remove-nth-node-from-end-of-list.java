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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int pos=size-n;
        if(pos==0){
            if(size==1) {
			head=null;
			size--;
		    }
            else { temp=head;
			head=head.next;
			temp.next=null;
			size--;
		}
        }
        for(int i=0;i<pos-1;i++){
           temp=temp.next;
        }
        if(temp.next!=null)
        temp.next=temp.next.next;
        return head;
    }
}