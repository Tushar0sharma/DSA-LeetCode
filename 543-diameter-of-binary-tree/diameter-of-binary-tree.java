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
    public void call(TreeNode root){
        if(root==null) return ;
        int l=h(root.left);
        int r=h(root.right);
        d=Math.max(l+r,d);
        call(root.left);
        call(root.right);
    }
    public int h(TreeNode r){
        if(r==null) return 0;
        return Math.max(h(r.left),h(r.right))+1;
    }
}