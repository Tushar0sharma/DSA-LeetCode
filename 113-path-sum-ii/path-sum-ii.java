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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        call(root,0,targetSum,l,ll);
        return ll;
    }
    public void call(TreeNode root,int c,int t,List<Integer>l,List<List<Integer>>ll){
        if(root==null) return ;
        l.add(root.val);
        if(root.left==null && root.right==null && c+root.val==t){
            ll.add(new ArrayList<>(l));
        }
        call(root.left,c+root.val,t,l,ll);
        call(root.right,c+root.val,t,l,ll);
        l.remove(l.size()-1);
    }
}