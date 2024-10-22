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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        l.add((long)root.val);
        while(!q.isEmpty()){
            int s=q.size();
            long sum=0;
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
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        return l.size()<=k?-1:l.get(k-1);
    }
}