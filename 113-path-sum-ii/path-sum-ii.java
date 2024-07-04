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
        call(l,ll,root,targetSum);
        return ll;
    }
    public void call(List<Integer>l,List<List<Integer>>ll,TreeNode root,int t){
        if(root==null) return ;
        l.add(root.val);
        if(root.left==null && root.right==null && t-root.val==0){
            ll.add(new ArrayList<>(l));
        }
        else{
            call(l,ll,root.left,t-root.val);
            call(l,ll,root.right,t-root.val);
        }
        l.remove(l.size()-1);
        return;
    }
}