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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int l=lh(root);
        int r=rh(root);
        if(l==r) return (1<<l)-1;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int lh(TreeNode root){
        int k=0;
        while(root!=null){
            k++;
            root=root.left;
        }
        return k;
    }
    public int rh(TreeNode root){
        int k=0;
        while(root!=null){
            k++;
            root=root.right;
        }
        return k;
    }
}