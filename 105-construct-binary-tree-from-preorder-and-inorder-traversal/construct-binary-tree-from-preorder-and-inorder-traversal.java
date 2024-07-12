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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root=build(mp,preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    public TreeNode build(Map<Integer,Integer>mp,int []preorder,int prest,int preen,int []inorder,int inst,int inen){
        if(prest>preen || inst>inen) return null;
        TreeNode root=new TreeNode(preorder[prest]);
        int inroot=mp.get(root.val);
        int numsl=inroot-inst;

        root.left=build(mp,preorder,prest+1,prest+numsl,inorder,inst,inroot-1);
        root.right=build(mp,preorder,prest+numsl+1,preen,inorder,inroot+1,inen);
        return root; 
    }
}