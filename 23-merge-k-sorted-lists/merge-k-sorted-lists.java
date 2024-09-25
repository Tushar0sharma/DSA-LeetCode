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
        if(lists.length==0) return null;
        return call(lists,0,lists.length-1);
    }
    public ListNode call(ListNode[]list,int s,int e){
        if(s==e){
            return list[s];
        }
        else if(s<e){
            int mid=s+(e-s)/2;
            ListNode l1=call(list,s,mid);
            ListNode l2=call(list,mid+1,e);
            return merge(l1,l2);
        }
        else {
            return null;
        }
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                dummy.next=new ListNode(l1.val);
                l1=l1.next;
                dummy=dummy.next;
            }
            else{
                dummy.next=new ListNode(l2.val);
                l2=l2.next;
                dummy=dummy.next;
            }
        }
        dummy.next=(l1==null)?l2:l1;
        return t.next;
    }
}