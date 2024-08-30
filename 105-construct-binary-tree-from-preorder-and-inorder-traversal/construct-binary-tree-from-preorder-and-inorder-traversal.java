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
        return call(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode call(int []pre,int []in,int ps,int pe,int is,int ie){
        if(ps>pe || is>ie) return null;

        TreeNode root=new TreeNode(pre[ps]);
        int idx=s(in,pre[ps]);
        int net=idx-is;
        root.left=call(pre,in,ps+1,ps+net,is,idx-1);
        root.right=call(pre,in,ps+net+1,pe,idx+1,ie);
        return root;
    }
    public int s(int []in,int e){
        for(int i=0;i<in.length;i++){
            if(e==in[i]) return i;
        }
        return 0;
    }
}