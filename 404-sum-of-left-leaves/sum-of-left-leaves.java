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
        return call(root,false);
    }
    public int call(TreeNode root,boolean t){
        if(root==null) return 0;
        if(root.left==null && root.right==null && t==true) return root.val;
        if(root.left==null && root.right==null && t==false) return 0;
        int a=call(root.left,true);
        int b=call(root.right,false);
        return a+b;
    }
}