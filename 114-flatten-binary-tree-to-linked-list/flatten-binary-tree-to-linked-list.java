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
    List<Integer> arr=new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null) return;
        ans(root);
    TreeNode dummy=root;
    for(int i=1;i<arr.size();i++){
        dummy.left=null;
        dummy.right=new TreeNode(arr.get(i));
        dummy=dummy.right;
    }
    return ;
    }
    public void ans(TreeNode tree){
        if(tree==null) return ;
        arr.add(tree.val);
        ans(tree.left);
        ans(tree.right);
        return;
    }
}