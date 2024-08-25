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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        call(l,root);
        return l;
    }
    public void call(List<Integer>l,TreeNode root){
        if(root==null) return;
        call(l,root.left);
        call(l,root.right);
        l.add(root.val);
    }
}