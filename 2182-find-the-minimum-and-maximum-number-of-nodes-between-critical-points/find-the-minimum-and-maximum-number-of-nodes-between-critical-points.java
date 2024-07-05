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
        ListNode temp=head;
        int len=len(temp);
        int []ans={-1,-1};
        if(len==2) return ans;
        int i=2;
        List<Integer>l=new ArrayList<>();
        while(temp.next!=null && temp.next.next!=null){
            if(temp.val>temp.next.val && temp.next.val<temp.next.next.val){
                l.add(i);
            }
            if(temp.val<temp.next.val && temp.next.val>temp.next.next.val){
                l.add(i);
            }
            i++;
            temp=temp.next;
        }
        if(l.size()<2) return ans;
        int min=Integer.MAX_VALUE;
        for(int k=1;k<l.size();k++){
            min=Math.min(min,l.get(k)-l.get(k-1));
        }
        ans[0]=min;
        ans[1]=l.get(l.size()-1)-l.get(0);
        return ans;
    }
    public int len(ListNode temp){
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
}