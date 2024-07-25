class Solution {
    List<List<String>>ans=new ArrayList<>();
    String b;
    Map<String,Integer>mp;
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String>st=new HashSet<>();
        for(String s:wordList) st.add(s);
        b=beginWord;
        Queue<String>q=new LinkedList<>();
        q.add(beginWord);
        mp=new HashMap<>();
        mp.put(beginWord,1);
        st.remove(beginWord);

        while(!q.isEmpty()){
            String word=q.poll();
            int step=mp.get(word);

            if(word.equals(endWord)) break;
            for(int i=0;i<beginWord.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[]ch1=word.toCharArray();
                    ch1[i]=ch;
                    String replace=new String(ch1);

                    if(st.contains(replace)){
                        q.add(replace);
                        st.remove(replace);
                        mp.put(replace,step+1);
                    }
                }
            }
        }
        if(mp.containsKey(endWord)){
            List<String>seq=new ArrayList<>();
            seq.add(endWord);
            dfs(endWord,seq);
        }
        return ans;        
    }
    public void dfs(String a,List<String>l){
        if(a.equals(b)){
            List<String>k=new ArrayList<>(l);
            Collections.reverse(k);
            ans.add(k);
            return ;
        }
        int step=mp.get(a);
        int sz=a.length();

        for(int i=0;i<sz;i++){
            for(char ch='a';ch<='z';ch++){
                char[]ch1=a.toCharArray();
                ch1[i]=ch;
                String replace=new String(ch1);
                if(mp.containsKey(replace) && mp.get(replace)+1==step){
                    l.add(replace);
                    dfs(replace,l);
                    l.remove(l.size()-1);
                }
            }
        }
    }
}