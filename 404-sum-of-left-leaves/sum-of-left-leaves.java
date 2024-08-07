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
        return dfs(root,false);
    }
    public int dfs(TreeNode root,boolean l){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return l?root.val:0;
        return dfs(root.left,true)+dfs(root.right,false);
    }
}