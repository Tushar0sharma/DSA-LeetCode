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
    public int rob(TreeNode root) {
        int []ans=call(root);
        return Math.max(ans[0],ans[1]);
    }
    public int [] call(TreeNode root){
        if(root==null) return new int[2];
        int []l=call(root.left);
        int []r=call(root.right);
        int []ans=new int[2];
        ans[0]=root.val+l[1]+r[1];
        ans[1]=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
        return ans;
    }

}