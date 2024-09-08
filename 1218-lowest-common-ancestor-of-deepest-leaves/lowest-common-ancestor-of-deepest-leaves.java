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
    int max=0;
    TreeNode lca=null;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        call(root,0);
        return lca;    
    }
    public int call(TreeNode root,int d){
        max=Math.max(d,max);
        if(root==null){
            return d;
        }
        int l=call(root.left,d+1);
        int r=call(root.right,d+1);
        if(l==max&& r==max){
            lca=root;
        }
        return Math.max(l,r);
    }
}