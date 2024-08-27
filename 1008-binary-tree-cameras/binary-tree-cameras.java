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
    int cnt=0;
    public int minCameraCover(TreeNode root) {
        int k=call(root);
        if(k==-1) cnt++;
        return cnt;
    }
    public int call(TreeNode root){
        if(root==null) return 1;
        int a=call(root.right);
        int b=call(root.left);
        if(a==-1 || b==-1){
            cnt++;
            return 0;
        }
        if(a==0 || b==0) return 1;
        return -1; 
    }
}