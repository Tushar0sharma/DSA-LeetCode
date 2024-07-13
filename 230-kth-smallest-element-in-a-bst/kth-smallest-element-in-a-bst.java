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
    static int c=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        c=0;
        return r(root,k);
    }
    public int r(TreeNode root,int k){
        if(root==null) return 0;
        int a=r(root.left,k);
        if(a!=0) return a;
        c++;
        if(k==c) return root.val;
        int b=r(root.right,k);
        return b;
    }
}