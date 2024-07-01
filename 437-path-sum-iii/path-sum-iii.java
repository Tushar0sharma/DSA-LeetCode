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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;

        help(root,targetSum,0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return cnt;
    }
    public void help(TreeNode root,int t,long i){
        if(root==null) return ;
        i+=root.val;
        if(i==t){
            cnt++;
        }
        help(root.left,t,i);
        help(root.right,t,i);
    }
}