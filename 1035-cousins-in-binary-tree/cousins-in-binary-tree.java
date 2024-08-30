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
    int px=-1;
    int py=-1;
    int dx=-1;
    int dy=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        call(root,x,y,-1,0);
        return (px!=py && dx==dy);
    }
    public void call(TreeNode root,int x,int y,int parx,int depth){
        if(root==null) return;
        if(root.val==x){
            px=parx;
            dx=depth;
        }
        else if(root.val==y){
            py=parx;
            dy=depth;
        }
        call(root.left,x,y,root.val,depth+1);
        call(root.right,x,y,root.val,depth+1);
    }
}