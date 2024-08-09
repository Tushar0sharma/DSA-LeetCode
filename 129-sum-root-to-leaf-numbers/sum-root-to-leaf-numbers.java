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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        List<String>l=new ArrayList<>();
        call(root,"",l);
        int sum=0;
        for(String i:l){
            sum+=Integer.valueOf(i);
        }
        return sum;
    }
    public void call(TreeNode root,String a,List<String>l){
        if(root==null) return;
        if(root.left==null && root.right==null){
            l.add(a+root.val);
            return;
        }
        call(root.left,a+root.val,l);
        call(root.right,a+root.val,l);
        return;
    }
}