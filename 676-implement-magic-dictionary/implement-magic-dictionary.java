class trie{
    trie []arr=new trie[26];
    boolean isend;
    trie(){
        isend=false;
        for(int i=0;i<26;i++) arr[i]=null;
    }
}
class MagicDictionary {
    trie root=new trie();
    public MagicDictionary() {
        
    }
    
    public void buildDict(String[] dictionary) {
        for(String s:dictionary){
            trie node=root;
            for(char ch:s.toCharArray()){
                int idx=ch-'a';
                if(node.arr[idx]==null) node.arr[idx]=new trie();
                node=node.arr[idx];
            }
            node.isend=true;
        }
    }
    
    public boolean search(String searchWord) {
        char[]ch=searchWord.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(char c='a';c<='z';c++){
                if(ch[i]==c) continue;
                char temp=ch[i];
                ch[i]=c;
                if(check(new String(ch))) return true;
                ch[i]=temp;
            }
        }
        return false;
    }
    public boolean check(String s){
        trie node=root;
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(node.arr[idx]==null) return false;
            node=node.arr[idx];
        }
        return node.isend;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */