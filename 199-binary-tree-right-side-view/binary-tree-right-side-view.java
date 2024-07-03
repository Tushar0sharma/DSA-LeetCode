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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        call(root,l,0);        
        return l;
    }
    public void call(TreeNode root,List<Integer>l,int i){
        if(root==null) return;
        if(i==l.size()) l.add(root.val);
        call(root.right,l,i+1);
        call(root.left,l,i+1);
    }
}