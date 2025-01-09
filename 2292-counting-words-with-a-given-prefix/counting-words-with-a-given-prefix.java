class trie{
    int cnt;
    trie[]arr;
    trie(){
        cnt=0;
        arr=new trie[26];
        for(int i=0;i<26;i++) arr[i]=null;
    }
}
class Solution {
    public void call(trie root,String s){
        trie craw=root;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(craw.arr[idx]==null){
                craw.arr[idx]=new trie();
            }
            craw=craw.arr[idx];
            craw.cnt++;
        }
    }
    public int find(String s,trie root){
        trie c=root;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(c.arr[idx]==null) return 0;
            c=c.arr[idx];
        }
        return c.cnt;
    }
    public int prefixCount(String[] words, String pref) {
        trie root=new trie();
        for(String s:words){
            call(root,s);
        }
        return find(pref,root);
    }
}