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
        Map<Integer,TreeNode>mp=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode top=q.poll();
                if(top.left!=null){
                    mp.put(top.left.val,top);
                    q.add(top.left);
                }
                if(top.right!=null){
                    mp.put(top.right.val,top);
                    q.add(top.right);
                }
            }
        }
        Map<Integer,Integer>m=new HashMap<>();
        q.add(target);
        while(k>0 && !q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode top=q.poll();
                m.put(top.val,1); 
                if(top.left!=null && !m.containsKey(top.left.val)){
                    q.add(top.left);
                }
                if(top.right!=null && !m.containsKey(top.right.val)){
                    q.add(top.right);
                }
                if(mp.containsKey(top.val) && !m.containsKey(mp.get(top.val).val)){
                    q.offer(mp.get(top.val));
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            l.add(q.poll().val);
        }
        return l;
    }
}