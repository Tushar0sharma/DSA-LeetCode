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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            double sum=0;
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                sum+=p.val;
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
            l.add((double)sum/s);
        }
        return l;
    }
}