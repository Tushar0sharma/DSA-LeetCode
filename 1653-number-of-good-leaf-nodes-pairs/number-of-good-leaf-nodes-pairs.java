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
    int sum=0;
    public int countPairs(TreeNode root, int distance) {
        traverse(root,distance);
        return sum;
    }
    public List<Integer> traverse (TreeNode root,int d){
        List<Integer>l=new ArrayList<>();
        if(root==null) return l;

        List<Integer>left=traverse(root.left,d);
        List<Integer>right=traverse(root.right,d);
        if(left.isEmpty() && right.isEmpty()){
            l.add(1);
            return l;
        }
        if(!left.isEmpty() && !right.isEmpty()){
            for(Integer ll:left){
                for(Integer rr:right){
                    if(ll+rr<=d) sum++;
                }
            }
        }

        for(Integer ll:left) l.add(ll+1);
        for(Integer rr:right) l.add(rr+1);
        return l;
    }
}