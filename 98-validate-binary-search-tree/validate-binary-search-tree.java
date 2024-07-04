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
    public boolean isValidBST(TreeNode root) {
        if(root==null ) return true;
        // if(call(root.left)>=root.val || call1(root.right)<=root.val){
        //     System.out.println(call(root.left));
        //     System.out.println(call1(root.right));
        //     System.out.println(root.val);
        //     return false;
        // }
        if (root.left != null && call(root.left) >= root.val) return false;
        
        if (root.right != null && call1(root.right) <= root.val) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public int call(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int l=Math.max(call(root.left),root.val);
        int r=Math.max(call(root.right),root.val);
        return Math.max(l,r);
    }
     public int call1(TreeNode root){
    if (root == null) return Integer.MAX_VALUE; 

    int leftMin = call1(root.left);  
    int rightMin = call1(root.right); 

    return Math.min(root.val, Math.min(leftMin, rightMin)); 
    }
}