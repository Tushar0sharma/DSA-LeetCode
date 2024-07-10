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
    TreeNode xp=null;
    TreeNode yp=null;
    int xd=-1,yd=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        call(root,x,y,0,null);
        return (xd==yd)&&(xp!=yp);
    }
    public void call(TreeNode root, int x, int y,int depth,TreeNode parent){
        if(root==null) return;
        if(root.val==x){
            xp=parent;
            xd=depth;
        }
        else if(root.val==y){
            yp=parent;
            yd=depth;
        }
        call(root.left,x,y,depth+1,root);
        call(root.right,x,y,depth+1,root);
    }
}