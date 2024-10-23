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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int maxl=root.val;
        int maxi=1;
        int k=0;
        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
            k++;
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                sum+=p.val;
                if(p.left!=null){
                    q.add(p.left);
                }
                if(p.right!=null){
                    q.add(p.right);
                }
            }
            if(maxl<sum ){
                maxl=sum;
                maxi=k;
            }
        }
        return maxi;
    }
}