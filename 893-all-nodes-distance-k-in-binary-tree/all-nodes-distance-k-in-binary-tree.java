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
    Map<TreeNode,Integer>mp=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>l=new ArrayList<>();
        find(root,target);
        dfs(root,k,mp.get(root),l);
        return l;
    }
    public int find(TreeNode root,TreeNode t){
        if(root==null) return -1;
        if(root==t){
            mp.put(root,0);
            return 0;
        }
        int l=find(root.left,t);
        if(l>=0){
            mp.put(root,l+1);
            return l+1;
        }
        int r=find(root.right,t);
        if(r>=0){
            mp.put(root,r+1);
            return r+1;
        }
        return -1;
    }
    public void dfs(TreeNode root,int k,int length,List<Integer>l){
        if(root==null) return ;
        if(mp.containsKey(root)){
            length=mp.get(root);
        }
        if(k==length){
            l.add(root.val);
        }
        dfs(root.left,k,length+1,l);
        dfs(root.right,k,length+1,l);
    }
}