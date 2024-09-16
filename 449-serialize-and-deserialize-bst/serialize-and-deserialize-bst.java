/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s=new StringBuilder();
        call(s,root);
        return s.toString();
    }
    public void call(StringBuilder s,TreeNode root){
        if(root==null) return;
        s.append(root.val+",");
        call(s,root.left);
        call(s,root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String []d=data.split(",");
        if(data.equals("")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(d[0]));
        for(int i=1;i<d.length;i++) root=call1(root,Integer.parseInt(d[i]));
        return root;
    }
    public TreeNode call1(TreeNode root,int s){
        if(root==null) return new TreeNode(s);
        if(root.val>s) root.left=call1(root.left,s);
        else if(root.val<s) root.right=call1(root.right,s);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;