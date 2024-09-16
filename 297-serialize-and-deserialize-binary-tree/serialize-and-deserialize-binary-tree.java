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
        String s="";
        if(root==null) return s;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int ss=q.size();
            for(int i=0;i<ss;i++){
                TreeNode p=q.poll();
                if(p==null) s=s+"#,";
                else s=s+p.val+",";
                if(p!=null){
                    q.add(p.left);
                    q.add(p.right);
                }
            }
        }
        return s;        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[]d=data.split(",");
        if(data=="") return null;
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode root=new TreeNode (Integer.parseInt(d[0]));
        q.add(root);
        for(int i=1;i<d.length;i++){
            TreeNode par=q.poll();
            if(!d[i].equals("#")){
                TreeNode l=new TreeNode(Integer.parseInt(d[i]));
                par.left=l;
                q.add(l);
            }
            if(!d[++i].equals("#")){
                TreeNode r=new TreeNode(Integer.parseInt(d[i]));
                par.right=r;
                q.add(r);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));