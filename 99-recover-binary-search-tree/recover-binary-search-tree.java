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
    public void recoverTree(TreeNode root) {
        List<Integer>l= call(root);
        List<Integer>r=new ArrayList<>(l);
        Collections.sort(l);
        for(int i:r) System.out.println(i);
        int x=-1;
        int y=-1;
        for(int i=0;i<l.size();i++){
            if(r.get(i)!=l.get(i)){
                if(x==-1) x=r.get(i);
                else y=r.get(i);
            }
        }
        call1(root,x,y);      
    }
    public void call1(TreeNode root,int x,int y){
        if(root==null) return ;
        if(root.val==x ){
            root.val=y;
        }
        else if(root.val==y){
            root.val=x;
        }
        call1(root.left,x,y);
        call1(root.right,x,y);
    }
    public List<Integer> call(TreeNode r){
        List<Integer>ans=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        if(r==null) return ans;
        TreeNode curr=r;
        while(!s.isEmpty() || curr!=null){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }
}