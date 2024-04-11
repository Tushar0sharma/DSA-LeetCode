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
    public int numComponents(ListNode head, int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }   
        ListNode temp=head;
        while(temp!=null){
            mp.put(temp.val,mp.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        int cnt=0;
        temp=head;
        while(temp!=null){
            if(mp.get(temp.val)>1){
                while(temp!=null && mp.get(temp.val)>1){
                temp=temp.next;
                }
                cnt++;
            }
            else{
                temp=temp.next;
            }
        }
        return cnt;
    }
}