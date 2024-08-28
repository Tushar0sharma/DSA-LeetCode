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
    public TreeNode increasingBST(TreeNode k) {
        List<Integer>l=new ArrayList<>();
        call(l,k);
        TreeNode root=new TreeNode(l.get(0));
        TreeNode ans=root;
        for(int i=1;i<l.size();i++){
            root.right=new TreeNode(l.get(i));
            root=root.right;
        }
        return ans;
    }
    public void call(List<Integer>l,TreeNode r){
        if(r==null) return ;
        call(l,r.left);
        l.add(r.val);
        call(l,r.right);
    }
}