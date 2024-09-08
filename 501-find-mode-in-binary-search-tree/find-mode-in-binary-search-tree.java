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
    public int[] findMode(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        dfs(l,root);
        int currs=0;
        int maxs=0;
        int curr=0;
        List<Integer>ans=new ArrayList<>();
        for(int i:l){
            if(i==curr){
                currs++;
            }else{
                currs=1;
                curr=i;
            }
            if(currs>maxs){
                maxs=currs;
                ans=new ArrayList<>();
            }
            if(currs==maxs) ans.add(curr);
        }
        int []res=new int [ans.size()];
        int k=0;
        for(int i:ans) res[k++]=i;
        return res;
    }
    public void dfs(List<Integer>l,TreeNode root){
        if(root==null) return ;
        dfs(l,root.left);
        l.add(root.val);
        dfs(l,root.right);
    }
}