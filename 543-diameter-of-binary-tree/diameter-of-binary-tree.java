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
        int []dia=new int[1];
        dia[0]=0;
        call(dia,root);
        return dia[0];
    }
    public int call(int []dia,TreeNode root){
        if(root==null) return 0;
        int l=call(dia,root.left);
        int r=call(dia,root.right);
        dia[0]=Math.max(dia[0],l+r);
        return 1+Math.max(l,r);
    } 
}