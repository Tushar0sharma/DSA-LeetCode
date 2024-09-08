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
    TreeNode lca=null;
    int max=0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        call(root,0);
        return lca;
    }
    public int call(TreeNode root,int depth){
        max=Math.max(depth,max);
        if(root==null) return depth;

        int l=call(root.left,depth+1);
        int r=call(root.right,depth+1);
        if(l==max&&r==max) lca=root;
        return Math.max(l,r);
    }
}