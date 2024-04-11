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
        List<Integer>l=new ArrayList<>();
        while(temp!=null){
            ListNode temp1=temp;
            while(temp1!=null && temp.val>=temp1.val){
                temp1=temp1.next;
            }
            if(temp1==temp || temp1==null) l.add(0);
            else l.add(temp1.val);
            temp=temp.next;
        }
        int []arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}