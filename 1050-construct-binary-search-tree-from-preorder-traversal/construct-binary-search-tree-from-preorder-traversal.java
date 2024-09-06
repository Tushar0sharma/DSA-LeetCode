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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i:preorder){
            root=call(i,root);
        }
        return root;
    }
    public TreeNode call(int e,TreeNode root){
        if(root==null) return new TreeNode(e);
        if(e>root.val) root.right=call(e,root.right);
        else if(e<root.val) root.left=call(e,root.left);
        return root;
    }
}