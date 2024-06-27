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
    public int maxDepth(TreeNode root) {
        return depth(0,root)+1;
    }
    public int depth(int depth,TreeNode root){
        if(root==null) return depth-1;
        else if(root.left==null && root.right==null) return depth;
        else if(root.left!=null && root.right==null){
            return depth(depth+1,root.left);
        }
        else if(root.right!=null && root.left==null){
            return depth(depth+1,root.right);
        }
        else
        return Math.max(depth(depth+1,root.left),depth(depth+1,root.right));
    }
}