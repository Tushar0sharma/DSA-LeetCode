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
    Map<Integer,Integer>mp=new HashMap<>();
    int max=Integer.MIN_VALUE;
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        List<Integer>l=new ArrayList<>();
        for(int i:mp.keySet()){
            if(mp.get(i)==max) l.add(i);
        }
        return l.stream().mapToInt(i->i).toArray();
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int a=dfs(root.left)+dfs(root.right)+root.val;
        mp.put(a,mp.getOrDefault(a,0)+1);
        max=Math.max(max,mp.get(a));
        return a;
    }
}