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
        TreeNode root=build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
        return root;
    }
    public TreeNode build(int []pre,int ps,int pe,int[] in,int is,int ie,Map<Integer,Integer>mp){
        if(ps>pe && is>ie){
            return null;
        }
        TreeNode root=new TreeNode (pre[ps]);
        int inroot=mp.get(root.val);
        int left=inroot-is;
        root.left=build(pre,ps+1,ps+left,in,is,inroot-1,mp);
        root.right=build(pre,ps+left+1,pe,in,inroot+1,ie,mp);
        return root;
    }
}