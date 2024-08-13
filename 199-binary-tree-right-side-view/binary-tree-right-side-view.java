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
    static int vis;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        if(root==null) return l;
        vis=-1;
        call(root,0,l);
        return l;
    }
    public void call(TreeNode root,int curr,List<Integer>l){
        if(root==null) return ;
        if(curr>vis){
            l.add(root.val);
            vis=curr;
            System.out.println(vis);
        }
        call(root.right,curr+1,l);
        call(root.left,curr+1,l);
    }
}