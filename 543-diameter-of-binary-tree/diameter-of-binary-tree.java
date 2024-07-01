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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        int l1=height(root.left);
        int l2=height(root.right);
        int ll=l1+l2;
        int l=diameterOfBinaryTree(root.left);
        int r=diameterOfBinaryTree(root.right);
        return Math.max(Math.max(l,r),ll);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int l=1+height(root.left);
        int r=1+height(root.right);
        return Math.max(l,r);
    }
}