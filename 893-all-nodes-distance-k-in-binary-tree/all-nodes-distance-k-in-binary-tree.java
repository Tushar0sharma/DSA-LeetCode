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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>l=new ArrayList<>();
        call(root,target.val,k,l);
        return l;
    }
    public int call(TreeNode root,int tar,int k,List<Integer>ll){
        if(root==null) return -1;
        if(root.val==tar){
            print(root,k,ll);
            return 0;
        }
        int l=call(root.left,tar,k,ll);
        if(l>=0){
            if(l+1==k) ll.add(root.val);
            else print(root.right,k-l-2,ll);
            return l+1;
        }
        int r=call(root.right,tar,k,ll);
        if(r>=0){
            if(r+1==k) ll.add(root.val);
            else print(root.left,k-r-2,ll);
            return r+1;
        }
        return -1;
    }
    public void print(TreeNode r,int k,List<Integer>ll){
        if(r==null || k<0) return ;
        if(k==0) ll.add(r.val);
        print(r.left,k-1,ll);
        print(r.right,k-1,ll);
    }
}