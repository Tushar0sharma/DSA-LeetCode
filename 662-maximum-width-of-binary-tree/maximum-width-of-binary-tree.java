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
 class pair{
    int v;
    TreeNode n;
    pair(TreeNode n,int v){
        this.n=n;
        this.v=v;
    }
    public TreeNode getNode(){
        return n;
    }
    public int getValue(){
        return v;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair>q=new LinkedList<>();
        if(root==null) return 0;
        int ans=0;
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            int min=q.peek().getValue();
            int s=q.size();
            int first=0,last=0;
            for(int i=0;i<s;i++){
                pair current = q.poll();
                int c = current.getValue() - min;
                TreeNode node = current.getNode();
                if(i==0) first=c;
                if(i==s-1) last=c;
                if(node.left!=null) q.add(new pair(node.left,2*c+1));
                if(node.right!=null) q.add(new pair(node.right,2*c+2));
            }
            ans=Math.max(last-first+1,ans);
        }
        return ans;
    }
}