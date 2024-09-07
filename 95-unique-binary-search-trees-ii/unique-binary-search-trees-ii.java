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
    Map<String,List<TreeNode>>memo=new HashMap<>();
    public List<TreeNode> generateTrees(int n) {
        return call(1,n);
    }
    public List<TreeNode> call(int st,int en){
        List<TreeNode>ans=new ArrayList<>();
        if(st>en){
            ans.add(null);
            return ans;
        }
        if(st==en){
            ans.add(new TreeNode(st));
            return ans;
        }
        String key = st + "," + en;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        for(int i=st;i<=en;i++){
            List<TreeNode>l=call(st,i-1);
            List<TreeNode>r=call(i+1,en);
            for(TreeNode left:l){
                for(TreeNode right:r){
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    ans.add(root);
                }
            }
        }
        memo.put(key,ans);
        return ans;
    }

}