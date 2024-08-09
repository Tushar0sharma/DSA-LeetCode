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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode r=new TreeNode(root.val);
        call(r,root);
        return r;
    }
    public void call(TreeNode r,TreeNode root){
        if(root==null) return ;
        if(root.left!=null) r.right=new TreeNode(root.left.val);
        if(root.right!=null) r.left=new TreeNode(root.right.val);
        call(r.right,root.left);
        call(r.left,root.right);        
    }
}