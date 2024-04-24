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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode h=rev(head,1);
        return h;
    }
    public ListNode rev(ListNode head,int i){
        if(check(head,i)){
            int size=len(head);
            if(size%2!=0){
                return head;
            }
            else{
                return reverse(head);
            }
        }
        else{
        if(i % 2 == 0){
                
                ListNode hPoint = head;
                
                int count = 1;
               // System.out.println(i);
                while(count < i){
                    head = head.next;
                    count++;
                }
                
                ListNode next = head.next;
                head.next = null;
                
                ListNode rev = reverse(hPoint);
                ListNode newHead = rev;
                
                while(rev.next != null){
                    rev = rev.next;
                }
                
                rev.next = rev(next,i+1);
                
                return newHead;
                
                
            }else{
                ListNode hPoint = head;
                
                int count = 1;
                
                while(count < i){
                    head = head.next;
                    count++;
                }
                
                head.next = rev( head.next,i+1 );
                
                return hPoint;
            }
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        
        while(head != null){
            
            ListNode temp = head.next;
            
            head.next = prev;
            
            prev = head;
            
            head = temp;
            
        }
        
        return prev;
        
    }
    public int len(ListNode head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
    public boolean check(ListNode head,int i){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt<i;
    }
}