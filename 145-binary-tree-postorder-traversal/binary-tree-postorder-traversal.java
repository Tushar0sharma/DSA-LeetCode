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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        if(root==null) return l;
        Stack<TreeNode>s=new Stack<>();
        s.add(root);                                                                                                                                                                                                             
        while(!s.isEmpty()){
            if(s.peek().left!=null){
                TreeNode temp=s.peek().left;
                s.peek().left=null;
                s.add(temp);
            }
            else if(s.peek().right!=null){
                TreeNode temp=s.peek().right;
                s.peek().right=null;
                s.add(temp);
            }
            else{
                l.add(s.pop().val);
            }
        }
        return l;
    }
}