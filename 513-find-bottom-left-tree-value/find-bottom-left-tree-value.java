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
    TreeNode ans=null;
    int depth=0;
    public int findBottomLeftValue(TreeNode root) {
        call(root,0);
        if(ans==null) return root.val;
        return ans.val;
    }
    public void call(TreeNode root,int d){
        if(root==null) return ;
        call(root.left,d+1);
        if(d>depth) {
            depth=d;
            ans=root;
        }
        call(root.right,d+1);
    }
}