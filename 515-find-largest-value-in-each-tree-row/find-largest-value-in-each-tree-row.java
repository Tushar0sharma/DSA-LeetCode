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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return l;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
            while(s-->0){
                TreeNode p=q.poll();
                pq.add(p.val);
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
            l.add(pq.poll());
        }
        return l;
    }
}