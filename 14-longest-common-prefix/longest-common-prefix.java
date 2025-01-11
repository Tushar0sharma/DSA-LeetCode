class trie{
    trie[]arr;
    int cnt;
    trie(){
        cnt=0;
        arr=new trie[26];
        for(int i=0;i<26;i++) arr[i]=null;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        trie root=new trie();
        for(String s:strs){
            add(s,root);
        }
        int n=strs.length;
        return call("",root,n);
    }
    public String call(String s,trie root,int n){
        trie node=root;
        while(true){
            int idx1='.';
            for(char ch='a';ch<='z';ch++){
                int idx=ch-'a';
                if(node.arr[idx]!=null && node.arr[idx].cnt==n){
                    idx1=ch;
                }
            }
            if(idx1=='.') break;
            s+=(char)idx1;
            node=node.arr[idx1-'a'];
        }
        return s;
    }
    public void add(String s,trie root){
        trie node=root;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(node.arr[idx]==null) node.arr[idx]=new trie();
            node=node.arr[idx];
            node.cnt++;
        }
    }
}