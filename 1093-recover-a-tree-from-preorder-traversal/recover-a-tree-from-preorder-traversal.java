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
    public TreeNode recoverFromPreorder(String s) {
        Map<Integer,TreeNode>mp=new HashMap<>();
        int i=0;
        while(i<s.length()){
            int l=0,num=0;
            while(i<s.length()&&s.charAt(i)=='-'){
                l++;
                i++;
            }
            while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                num=num*10+(s.charAt(i)-'0');
                i++;
            }
            TreeNode c=new TreeNode(num);
            mp.put(l,c);
            if(l>0){
                TreeNode par=mp.get(l-1);
                if(par.left==null) par.left=c;
                else par.right=c;
            }
        }
        return mp.get(0);        
    }
}