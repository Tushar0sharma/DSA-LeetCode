

class Solution {
    trie root=new trie();
    class trie{
        int score=0;
        trie []ch=new trie[26];
    }
    public int[] sumPrefixScores(String[] words) {
        for(String s:words){
            trie temp=root;
            for(char c:s.toCharArray()){
                if(temp.ch[c-'a']==null) temp.ch[c-'a']=new trie();
                temp.ch[c-'a'].score++;
                temp=temp.ch[c-'a'];
            }
        }
        int []res=new int[words.length];
        for(int i=0;i<res.length;i++){
            int s=0;
            trie temp=root;
            for(char c:words[i].toCharArray()){
                s+=temp.ch[c-'a'].score;
                temp=temp.ch[c-'a'];
            }
            res[i]=s;
        }
        return res;
    }
}