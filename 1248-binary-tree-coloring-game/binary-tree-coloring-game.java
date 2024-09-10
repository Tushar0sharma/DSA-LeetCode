/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int cnt=0;
    int cnt1=0;
    int cnt2=0;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        int a=call(root,x,n);
        int max=Math.max(cnt,cnt1);
        max=Math.max(cnt2,max);
        return max>(n/2);
    }
    public int call(TreeNode root,int x,int n){
        if(root==null){
            return 0;
        }
        int l=call(root.left,x,n);
        int r=call(root.right,x,n);
        if(root.val==x){
            cnt=n-l-r-1;
            cnt1=l;
            cnt2=r;
            return -1;
        }
        return l+r+1;
    }

}