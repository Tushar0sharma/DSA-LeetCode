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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int len=length(head);
        int []ans={-1,-1};
        if(len==2) return ans;
        ListNode temp=head;
        int i=2;
        List<Integer>l=new ArrayList<>();
        while(temp.next!=null && temp.next.next!=null){
            if(temp.val<temp.next.val && temp.next.val>temp.next.next.val){
                l.add(i);
            }
            if(temp.val>temp.next.val && temp.next.val<temp.next.next.val){
                l.add(i);
            }
            temp=temp.next;
            i++;
        }
        if(l.size()<2){
            return ans;
        }
        System.out.println(l);
        // if(l.size()==1){
        //     // ans[0]=l.get(0);
        //     // ans[1]=l.get(0);
        //     return ans;
        // }
        int mini=Integer.MAX_VALUE;
        for(int f=1;f<l.size();f++){
            mini=Math.min(l.get(f)-l.get(f-1),mini);
        }
        int max=l.get(l.size()-1)-l.get(0);
        ans[0]=mini;
        ans[1]=max;

        return ans;
    }
    public int length(ListNode head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}