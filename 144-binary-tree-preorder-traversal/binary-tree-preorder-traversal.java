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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        if(root==null) return l;
        s.push(root);
        while(!s.isEmpty()){
            TreeNode p=s.pop();
            l.add(p.val);
            if(p.right!=null) s.push(p.right);
            if(p.left!=null) s.push(p.left);            
        }
        return l;
    }
}