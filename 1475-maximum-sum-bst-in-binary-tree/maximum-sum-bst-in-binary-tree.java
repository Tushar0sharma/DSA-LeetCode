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
 class pair{
    int sum;
    int max;
    int min;
    pair(int sum,int min,int max){
        this.min=min;
        this.sum=sum;
        this.max=max;
    }
 }
class Solution {
    int ans=0;
    public int maxSumBST(TreeNode root) {
        solve(root);
        return ans;     
    }
    public pair solve(TreeNode root){
        if(root==null) return new pair(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        pair l=solve(root.left);
        pair r=solve(root.right);
        if(root.val>l.max && root.val<r.min){
            ans=Math.max(ans,r.sum+l.sum+root.val);
            return new pair(r.sum+l.sum+root.val,Math.min(root.val,l.min),Math.max(root.val,r.max));
        }
        return new pair(0,Integer.MIN_VALUE,Integer.MAX_VALUE);   
    }
}










