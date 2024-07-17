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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode>f=new ArrayList<>();
        if(root==null) return f;
        Set<Integer>s=new HashSet<>();
        for(int i:to_delete){
            s.add(i);
        }
        delete(s,root,f);
        if(!s.contains(root.val)) f.add(root);
        return f;        
    }
    private TreeNode delete (Set<Integer>s,TreeNode root,List<TreeNode>l){
        if(root==null) return null;
        root.left=delete(s,root.left,l);
        root.right=delete(s,root.right,l);
        if(s.contains(root.val)){
            if(root.left!=null) l.add(root.left);
            if(root.right!=null) l.add(root.right);
            return null;
        }
        return root;
    }
}