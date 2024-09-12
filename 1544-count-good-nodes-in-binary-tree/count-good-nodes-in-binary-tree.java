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
    public int goodNodes(TreeNode root) {
        int []ans=new int[1];
        call(root,Integer.MIN_VALUE,ans);
        return ans[0];
    }
    public void call(TreeNode root,int max,int []ans){
        if(root==null) return ;
        if(max<=root.val){
             ans[0]++;
             }
        call(root.left,Math.max(max,root.val),ans);
        call(root.right,Math.max(max,root.val),ans);
    }
}