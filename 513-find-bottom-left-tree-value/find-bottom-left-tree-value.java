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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int ans=root.val;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                if(i==0) ans=p.val;
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
        }
        return ans;
    }
}