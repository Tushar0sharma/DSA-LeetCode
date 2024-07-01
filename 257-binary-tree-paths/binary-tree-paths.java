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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>l=new ArrayList<>();
        if(root!=null) call(root,"",l);
        return l;
    }
    public void call(TreeNode root,String ans,List<String>l){
        if(root.left==null && root.right==null) l.add(ans+root.val);
        if(root.left!=null) call(root.left,ans+root.val+"->",l);
        if(root.right!=null) call(root.right,ans+root.val+"->",l);
    }
}