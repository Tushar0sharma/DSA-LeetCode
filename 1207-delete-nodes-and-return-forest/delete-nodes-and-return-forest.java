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
        List<TreeNode>l=new ArrayList<>();
        Set<Integer>s=new HashSet<>();
        for(int i:to_delete){
            s.add(i);
        }
        root=call(s,root,l);
        if(root!=null) l.add(root);
        return l;
    }
    public TreeNode call(Set<Integer>s,TreeNode r,List<TreeNode>l){
        if(r==null) return null;
        r.left=call(s,r.left,l);
        r.right=call(s,r.right,l);

        if(s.contains(r.val)){
            if(r.left!=null) l.add(r.left);
            if(r.right!=null) l.add(r.right);
            return null;
        }
        return r;
    }
}