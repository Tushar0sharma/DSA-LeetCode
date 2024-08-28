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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return call(root1,root2);        
    }
    public TreeNode call(TreeNode r1,TreeNode r2){
        if(r1==null) return r2;
        if(r2==null) return r1;        
        r1.val+=r2.val;
        if(r2.left!=null)
        r1.left=call(r1.left,r2.left);
        if(r2.right!=null)
        r1.right=call(r1.right,r2.right);
        return r1;
    }
}