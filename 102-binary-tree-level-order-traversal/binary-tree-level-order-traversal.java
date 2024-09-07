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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        List<List<Integer>>ll=new ArrayList<>();
        if(root==null) return ll;
        while(!q.isEmpty()){
            List<Integer>l=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                l.add(p.val);
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
            ll.add(l);
        }
        return ll;
    }
}