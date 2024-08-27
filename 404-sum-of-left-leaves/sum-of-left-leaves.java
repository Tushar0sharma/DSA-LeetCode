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
    public int sumOfLeftLeaves(TreeNode root) {
        return call(root);
    }
    public int call(TreeNode root){
        if(root==null) return 0;
        int a=0;
        if(root.left!=null && root.left.left==null && root.left.right==null)  a+=root.left.val;
        return a+call(root.left)+call(root.right);
    }
}