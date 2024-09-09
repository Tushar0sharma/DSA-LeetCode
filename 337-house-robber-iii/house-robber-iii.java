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
    Map<TreeNode,Integer>mp=new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        if(mp.containsKey(root)) return mp.get(root);

        if(root.left!=null){
            ans+=rob(root.left.left)+rob(root.left.right);
        }
        if(root.right!=null) ans+=rob(root.right.left)+rob(root.right.right);
        int a=Math.max(ans+root.val,rob(root.left)+rob(root.right));
        mp.put(root,a);
        return a;
    }
}