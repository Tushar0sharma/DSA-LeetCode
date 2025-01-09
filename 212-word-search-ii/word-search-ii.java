class Solution {
    class trie{
        trie []arr=new trie[26];
        boolean isend;
        String word;
    }
    public trie gettrie(){
        trie t=new trie();
        t.isend=false;
        t.word="";
        for(int i=0;i<26;i++){ t.arr[i]=null;}
        return t;
    }
    public void make(String s,trie root){
        trie crawler=root;
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(crawler.arr[idx]==null){
                crawler.arr[idx]=gettrie();
            }
            crawler=crawler.arr[idx];
        }
        crawler.word=s;
        crawler.isend=true;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        trie root=gettrie();
        for(String s:words){
            make(s,root);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                call(root,board,i,j,result);
            }
        }
        return result;
    }
    public void call(trie root,char [][]ch,int i,int j,List<String>l){
        if(i>=ch.length || j>=ch[0].length || i<0 || j<0 || ch[i][j]=='.' || root.arr[(ch[i][j]-'a')]==null ) return;
        root=root.arr[ch[i][j]-'a'];
        if(root.isend){
            root.isend=false;
            l.add(root.word);
        }
        char temp=ch[i][j];
        ch[i][j]='.';
        call(root,ch,i+1,j,l);
        call(root,ch,i-1,j,l);
        call(root,ch,i,j+1,l);
        call(root,ch,i,j-1,l);
        ch[i][j]=temp;
    }    
}
