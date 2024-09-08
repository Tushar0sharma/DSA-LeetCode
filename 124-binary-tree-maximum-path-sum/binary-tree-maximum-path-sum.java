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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        call(root);
        return max;
    }
    public int call(TreeNode root){
        if(root==null) return 0;
        int l=Math.max(0,call(root.left));
        int r=Math.max(0,call(root.right));
        max=Math.max(max,l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}