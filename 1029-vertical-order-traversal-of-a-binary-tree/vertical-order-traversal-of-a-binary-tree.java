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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,List<int[]>>mp=new TreeMap<>();
        List<List<Integer>>ll=new ArrayList<>();
        call(root,0,0,mp);
        for(int i:mp.keySet()){
            List<int[]>t=mp.get(i);
            Collections.sort(t,(a,b)->{
                if(a[0]!=b[0]) return a[0]-b[0];
                return a[1]-b[1];
            });
            List<Integer> column = new ArrayList<>();
            for (int[] node : t) {
                column.add(node[1]);
            }
            ll.add(column);
        }
        return ll;
    }
    public void call(TreeNode root,int x,int y,Map<Integer,List<int[]>>mp){
        if(root==null) return ;
        mp.computeIfAbsent(y,k->new ArrayList<>()).add(new int[]{x,root.val});
        call(root.left,x+1,y-1,mp);
        call(root.right,x+1,y+1,mp);
    }

}