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
    public int maxDepth(TreeNode root) {
        return depth(0,root)+1;
    }
    public int depth(int depth,TreeNode root){
        if(root==null) return depth-1;
        int l=depth(depth+1,root.left);
        int r=depth(depth+1,root.right);
        return Math.max(l,r);
    }
}