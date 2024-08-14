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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        call(root);
        return d;
    }
    public int call(TreeNode root){
        if(root==null) return 0;
        int l=call(root.left);
        int r=call(root.right);
        d=Math.max(d,l+r);
        return Math.max(l,r)+1;
    }
}