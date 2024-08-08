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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][]mat=new int[m][n];
        int r=0;
        int c=0;
        m--;
        n--;

        while(r<=m && c<=n){
            for(int i=c;i<=n;i++){
                if(head!=null){   
                mat[r][i]=head.val;
                head=head.next;
                }
                else{
                    mat[r][i]=-1;
                }
            }
            r++;
            for(int i=r;i<=m;i++){
                if(head!=null){
                    mat[i][n]=head.val;
                    head=head.next;
                }
                else{
                    mat[i][n]=-1;
                }
            }
            n--;

            if(r>m || c>n) break;

            for(int i=n;i>=c;i--){
                if(head!=null){   
                mat[m][i]=head.val;
                head=head.next;
                }
                else{
                    mat[m][i]=-1;
                }
            }
            m--;
            for(int i=m;i>=r;i--){
                if(head!=null){
                    mat[i][c]=head.val;
                    head=head.next;
                }
                else{
                    mat[i][c]=-1;
                }
            }
            c++;
        }
        return mat;
    }
}