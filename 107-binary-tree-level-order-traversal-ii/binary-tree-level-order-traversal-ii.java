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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ll=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return ll;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer>l=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                l.add(q.poll().val);
            }
            ll.add(0,l);
        }
        return ll;
    }
}