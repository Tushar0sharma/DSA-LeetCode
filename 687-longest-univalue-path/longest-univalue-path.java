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
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
       
        call(root);

        return max;
    }
    public int call(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=call(root.left);
        int r=call(root.right);
        int lc=0;
        int rc=0;
        if(root.left!=null && root.left.val==root.val){
            lc=l+1;
        }
        if(root.right!=null && root.right.val==root.val){
            rc=r+1;
        }
        max=Math.max(lc+rc,max);
        return Math.max(lc,rc);
    }
}