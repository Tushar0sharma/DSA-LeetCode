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
        return call(lists,0,lists.length-1);
    }
    public ListNode call(ListNode []list,int i,int j){
        if(i==j){
            return list[i];
        }
        else if(i<j){
            int mid=(i+j)/2;
            ListNode l=call(list,i,mid);
            ListNode r=call(list,mid+1,j);
            return merge(l,r);
        }
        else{
            return null;
        }
    }
    public ListNode merge(ListNode l,ListNode r){
        ListNode ans=new ListNode();
        ListNode d=ans;
        while(l!=null && r!=null){
            if(l.val<r.val){
                d.next=new ListNode(l.val);
                l=l.next;
            }
            else{
                d.next=new ListNode(r.val);
                r=r.next;
            }
            d=d.next;
        }
        d.next=(l!=null)?l:r;
        return ans.next;
    }
}