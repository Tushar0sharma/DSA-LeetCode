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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>>ll=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        call(l,root);
        int n=l.size();
        for(int q:queries){
            List<Integer>a=new ArrayList<>();
            int i=0;
            int j=n-1;
            int lb=Integer.MIN_VALUE;
            int hb=Integer.MAX_VALUE;
            while(i<=j){
                int mid=(i+j)/2;
                if(l.get(mid)>q){
                    j=mid-1;
                    hb=Math.min(hb,l.get(mid));
                }
                else if(l.get(mid)<q){
                    i=mid+1;
                    lb=Math.max(lb,l.get(mid));
                }
                else{
                    lb=q;
                    hb=q;
                    break;
                }
            }
            if(hb==Integer.MAX_VALUE) hb=-1;
            if(lb==Integer.MIN_VALUE) lb=-1;
            
            a.add(lb);
            a.add(hb);
            ll.add(new ArrayList<>(a));
        }
        return ll;
    }
    public void call(List<Integer>l,TreeNode root){
        if(root==null) return ;
        call(l,root.left);
        l.add(root.val);
        call(l,root.right);
    }
}