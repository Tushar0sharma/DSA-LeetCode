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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return call(postorder,inorder,0,postorder.length-1,0,inorder.length-1);
    }
    public TreeNode call(int []post,int []in,int ps,int pe,int is,int ie){
        if(ps>pe || is>ie) return null;

        TreeNode root=new TreeNode(post[pe]);
        int idx=s(in,post[pe]);
        int ls=idx-is;
        // int rs=ie-idx;
        root.left=call(post,in,ps,ps+ls-1,is,idx-1);
        root.right=call(post,in,ps+ls,pe-1,idx+1,ie);
        return root;
    }
    public int s(int []in,int e){
        for(int i=0;i<in.length;i++){
            if(e==in[i]) return i;
        }
        return 0;
    }
}