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
        travel(ll,root,0);
        return ll;
    }
    public void travel(List<List<Integer>>ll,TreeNode root,int level){
        if(root==null) return;
        if(level>=ll.size()) ll.add(new ArrayList<>());
        List<Integer>l=ll.get(level);
        if(level%2==0) l.add(root.val);
        else l.add(0,root.val);
        travel(ll,root.left,level+1);
        travel(ll,root.right,level+1);
    }
}