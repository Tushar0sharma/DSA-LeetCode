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
        List<Integer>l=new ArrayList<>();
        call(l,root);
        List<List<Integer>>ll=new ArrayList<>();
        for(int q:queries){
            List<Integer>a=new ArrayList<>();
            int min=lower(q,l);
            int max=upper(q,l);
            a.add(min);
            a.add(max);
            ll.add(a);
        }
        return ll;
    }
    public int upper(int target,List<Integer>ll){
        int l=0;
        int r=ll.size()-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(ll.get(mid)<target){
                l=mid+1;
            }
            else{
                ans=ll.get(mid);
                r=mid-1;
            }
        }
        return ans;
    }
    public int lower(int target,List<Integer>ll){
        int l=0;
        int r=ll.size()-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(ll.get(mid)<=target){
                ans=ll.get(mid);
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    public void call(List<Integer>l,TreeNode root){
        if(root==null) return;
        call(l,root.left);
        l.add(root.val);
        call(l,root.right);
    }
}