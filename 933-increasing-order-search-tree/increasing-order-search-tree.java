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
    private TreeNode pre=null;
    private TreeNode res=null;
    public TreeNode increasingBST(TreeNode root) {
        in(root);
        return res;
    }
    public void in(TreeNode root){
        if(root==null) return;
        in(root.left);
        if(res==null) res=root;
        else pre.right=root;
        pre=root;
        root.left=null;
        in(root.right);
    }
}