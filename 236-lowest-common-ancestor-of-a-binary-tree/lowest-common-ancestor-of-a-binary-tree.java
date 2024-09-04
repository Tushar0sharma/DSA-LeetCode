/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode,TreeNode>mp=new HashMap<>();
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        mp.put(root,null);
        while(!st.isEmpty()){
            TreeNode pp=st.pop();
            if(pp.left!=null){
                mp.put(pp.left,pp);
                st.push(pp.left);
            }
            if(pp.right!=null){
                mp.put(pp.right,pp);
                st.push(pp.right);
            }
        }
        Set<TreeNode>l=new HashSet<>();
        while(p!=null){
            l.add(p);
            p=mp.get(p);
        }
        while(!l.contains(q)){
            q=mp.get(q);
        }
        return q;
    }
}