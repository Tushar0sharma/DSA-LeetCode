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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ll=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return ll;
        q.add(root);
        int k=0;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode n=q.poll();
                if(k%2==0){
                    l.add(n.val);
                }
                else{
                    l.addFirst(n.val);
                }
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            ll.add(l);
            k++;
        }
        return ll;
    }
}