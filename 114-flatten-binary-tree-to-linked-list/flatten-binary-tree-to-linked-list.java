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
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode>s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode q=s.pop();
            if(q.right!=null) s.add(q.right);
            if(q.left!=null) s.add(q.left);
            if(!s.isEmpty()) q.right=s.peek();
            q.left=null;
        }
        return;
    }
}