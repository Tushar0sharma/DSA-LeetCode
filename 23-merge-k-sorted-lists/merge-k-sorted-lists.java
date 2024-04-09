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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null){
            return  null;
        }
        ListNode head=partition(lists,0,lists.length-1);
        return head;
    }
    public ListNode partition(ListNode[]list,int start,int end){
        if(start==end){
            return list[start];
        }
        if(start<end){
            int mid=start+(end-start)/2;
            ListNode l1=partition(list,start,mid);
            ListNode l2=partition(list,mid+1,end);
            return merge(l1,l2);
        }
        else{
            return null;
        }
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                dummy.next=l1;
                dummy=dummy.next;
                l1=l1.next;
            }
            else{
                dummy.next=l2;
                dummy=dummy.next;
                l2=l2.next;
            }
        }
        if(l1!=null){
            dummy.next=l1;
        }
        if(l2!=null){
            dummy.next=l2;
        }
        return head.next;
    }
}