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
    public boolean isValidBST(TreeNode root) {
        if(root==null ) return true;
        if (root.left != null && max(root.left) >= root.val) return false;
        if (root.right != null && min(root.right) <= root.val) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public int max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        // int l=Math.max(max(root.left),root.val);
        // int r=Math.max(max(root.right),root.val);
        int l=max(root.left);
        int r=max(root.right);
        return Math.max(root.val,Math.max(l,r));
    }
    public int min(TreeNode root){
        if (root == null) return Integer.MAX_VALUE; 
        int leftMin = min(root.left);  
        int rightMin = min(root.right); 
        return Math.min(root.val, Math.min(leftMin, rightMin)); 
    }
}