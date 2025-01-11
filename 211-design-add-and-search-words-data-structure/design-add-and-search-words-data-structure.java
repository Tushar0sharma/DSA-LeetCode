class trie{
    boolean isend;
    trie []arr;
    trie(){
        arr=new trie[26];
        isend=false;
        for(int i=0;i<26;i++) arr[i]=null;
    }
}
class WordDictionary {
    trie root=new trie();
    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        trie node=root;
        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(node.arr[idx]==null) node.arr[idx]=new trie();
            node=node.arr[idx];
        }
        node.isend=true;
    }
    
    public boolean search(String word) {
        return call(word,0,root);
    }
    public boolean call(String s,int i,trie node){
        if(i==s.length() && node.isend) return true;
        if(i==s.length() ) return false;
        boolean res=false;
        if(s.charAt(i)=='.'){
            for(char ch='a';ch<='z';ch++){
                if(node.arr[ch-'a']!=null) res=res||call(s,i+1,node.arr[ch-'a']);
            }
        }
        else{
            if(node.arr[s.charAt(i)-'a']!=null)
            res=call(s,i+1,node.arr[s.charAt(i)-'a']);
        }
        return res;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */