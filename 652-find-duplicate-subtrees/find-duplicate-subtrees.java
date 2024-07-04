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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String,Integer>mp=new HashMap<>();
        List<TreeNode>l=new ArrayList<>();
        call(root,l,mp);
        return l;
    }
    public String call(TreeNode root,List<TreeNode>l,Map<String,Integer>mp){
        if(root==null) return "";
        String left=call(root.left,l,mp);
        String right=call(root.right,l,mp);
        String k=String.valueOf(root.val)+" "+left+" "+right;
        mp.put(k,mp.getOrDefault(k,0)+1);
        if(mp.get(k)==2){
            l.add(root);
        }
        return k;
    }
}