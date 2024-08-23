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
    public int maxAncestorDiff(TreeNode root) {
        return call(root,root.val,root.val);
    }
    public int call(TreeNode root,int max,int min){
        if(root==null) return max-min;
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
        return Math.max(call(root.left,max,min),call(root.right,max,min));
    }
}