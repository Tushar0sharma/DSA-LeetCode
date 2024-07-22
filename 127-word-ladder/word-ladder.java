class pair{
    String fir;
    int steps;
    pair(String fir,int steps){
        this.fir=fir;
        this.steps=steps;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<pair>q=new LinkedList<>();
        q.add(new pair(beginWord,1));
        Set<String>st=new HashSet<>();
        for(String s:wordList){
            st.add(s);
        }
        while(!q.isEmpty()){
            String node=q.peek().fir;
            int step=q.peek().steps;
            q.poll();
            if(node.equals(endWord)) return step;
            for(int i=0;i<node.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char []ch1=node.toCharArray();
                    ch1[i]=ch;
                    String replace=new String(ch1);
                    if(st.contains(replace)){
                        st.remove(replace);
                        q.add(new pair(replace,step+1));
                    }
                }
            }
        }
        return 0;
    }
}