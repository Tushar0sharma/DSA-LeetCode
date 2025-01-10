class trie{
    trie[]arr;
    String word;
    trie(){
        this.arr=new trie[26];
        for(int i=0;i<26;i++) this.arr[i]=null;
        this.word="";
    }
}
class Solution {
    String res="";
    public void call(trie root,String s){
        trie node=root;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(node.arr[idx]==null) node.arr[idx]=new trie();
            node =node.arr[idx];
        }
        node.word=s;
    }
    public void dfs(trie root){
        if(!root.word.isEmpty()){
            if(res.length()<root.word.length()) res=root.word;
            else if(res.length()==root.word.length() && res.compareTo(root.word)>0) res=root.word;
        }
        for(trie t:root.arr){
            if(t!=null && !t.word.isEmpty()) dfs(t);
        }
    }
    public String longestWord(String[] words) {
        trie root=new trie();
        for(String s:words){
            call(root,s);
        }
        dfs(root);
        return res;
    }
}