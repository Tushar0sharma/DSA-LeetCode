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
    public TreeNode replaceValueInTree(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        cal(root,l);
        call(root,l,0,root.val);
        return root;
    }
    public void call(TreeNode root,List<Integer>l,int i,int sib){
        if(root==null) return ;
        root.val=l.get(i)-sib;
        sib=(root.left!=null?root.left.val:0)+(root.right!=null?root.right.val:0);
        call(root.left,l,i+1,sib);
        call(root.right,l,i+1,sib);
    }
    public void cal(TreeNode root,List<Integer>l){
        Queue<TreeNode>q=new LinkedList<>();
        l.add(root.val);
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                if(p.left!=null){
                    q.add(p.left);
                    sum+=p.left.val;
                }
                if(p.right!=null){
                    q.add(p.right);
                    sum+=p.right.val;
                }
            }
            l.add(sum);
        } 
    }
}