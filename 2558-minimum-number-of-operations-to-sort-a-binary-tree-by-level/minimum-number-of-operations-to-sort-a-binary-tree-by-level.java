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
    public int minimumOperations(TreeNode root) {
        int swap=0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer>l=new ArrayList<>();
            while(s-->0){
                TreeNode p=q.poll();
                l.add(p.val);
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
            swap+=min(l);
        }
        return swap;
    }
    public int min(List<Integer>l){
        Map<Integer,Integer>mp=new HashMap<>();
        int []arr=new int[l.size()];
        int []s=new int [l.size()];
        for(int i=0;i<arr.length;i++) {
            arr[i]=l.get(i);
            mp.put(arr[i],i);
            s[i]=arr[i];
        }
        Arrays.sort(s);
        int swap=0;
        for(int i=0;i<l.size();i++){
            if(s[i]!=arr[i]){
                int t=mp.get(s[i]);
                mp.put(s[i],i);
                mp.put(arr[i],t);
                int temp=arr[t];
                arr[t]=arr[i];
                arr[i]=temp;
                swap++;
            }
        }
        return swap;
    }
}