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
class pair{
    TreeNode pp;
    int c;
    pair(TreeNode pp,int c){
        this.pp=pp;
        this.c=c;
    }
}
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        TreeNode r=new TreeNode(root.val);
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        List<Integer>ll=new ArrayList<>();
        ll.add(root.val);
        boolean odd=true;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer>l=new ArrayList<>();
            while(s-->0){
                TreeNode w=q.poll();
                if(w.left!=null){
                    q.add(w.left);
                    l.add(w.left.val);
                }
                if(w.right!=null){
                    q.add(w.right);
                    l.add(w.right.val);
                }
            }
            if(odd) Collections.reverse(l);
            odd=!odd;
            for(int i:l) ll.add(i);
        }
        System.out.println(ll);
        Queue<pair>qq=new LinkedList<>();
        qq.add(new pair(r,0));
        while(!qq.isEmpty()){
            pair k=qq.poll();
            System.out.println(k);
            if(k.c*2+1<ll.size()){
                k.pp.left=new TreeNode(ll.get(k.c*2+1));
                qq.add(new pair(k.pp.left,k.c*2+1));
            }
            if(k.c*2+2<ll.size()){
                k.pp.right=new TreeNode(ll.get(k.c*2+2));
                qq.add(new pair(k.pp.right,k.c*2+2));
            }
        }
        return r;
    }
}