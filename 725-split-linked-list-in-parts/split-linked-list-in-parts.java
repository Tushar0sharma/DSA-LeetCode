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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[]ans=new ListNode[k];
        int nn=0;
        ListNode curr=head;
        while(curr!=null){
            nn++;
            curr=curr.next;
        }
        curr=head;
        int split=nn/k;
        int remain=nn%k;
        for(int i=0;i<k;i++){
            ListNode n=new ListNode(0);
            ListNode t=n;
            int currs=split;
            if(remain>0){
                remain--;
                currs++;
            }
            while(currs>0){
                currs--;
                n.next=new ListNode(curr.val);
                n=n.next;
                curr=curr.next;
            }
            ans[i]=t.next;
        }
        return ans;
    }
}