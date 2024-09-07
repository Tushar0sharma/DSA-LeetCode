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
    TreeNode first=null;
    TreeNode sec=null;
    TreeNode last=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        call(root);
        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;
    }
    public void call(TreeNode root){
        if(root==null) return;
        call(root.left);
        if(first==null && last.val>root.val){
            first=last;
        }
        if(first!=null && last.val>root.val){
            sec=root;
        }
        last=root;
        call(root.right);
    }
}