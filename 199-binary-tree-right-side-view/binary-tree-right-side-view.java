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
    TreeNode n;
    int v;
    pair(TreeNode n,int v){
        this.n=n;
        this.v=v;
    } 
    public TreeNode getKey(){
        return n;
    }
    public int getValue(){
        return v;
    }
 }
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        if(root==null) return l;
        Queue<pair>q=new LinkedList<>();
        Map<Integer,Integer>mp=new TreeMap<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            int v=p.getValue();
            TreeNode n=p.getKey();
            if(!mp.containsKey(v)) mp.put(v,n.val);
            if(n.right!=null) q.add(new pair(n.right,v+1));
            if(n.left!=null) q.add(new pair(n.left,v+1));
        }
        for(int i:mp.values()){
            l.add(i);
        }
        return l;
    }
}