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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        return sum(new StringBuilder(),root); 
    }
    public int  sum(StringBuilder s,TreeNode root){
        if(root==null) return 0;
        s.append(root.val);
        if(root.left==null && root.right==null){
            int sum=Integer.parseInt(s.toString());
            s.deleteCharAt(s.length()-1);
            return sum;
        }
        int su=sum(s,root.left)+sum(s,root.right);
        s.deleteCharAt(s.length()-1);
        return su;
    }
}