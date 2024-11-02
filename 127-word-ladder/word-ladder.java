class Pair{
    String p;
    int v;
    Pair(String p,int v){
        this.p=p;
        this.v=v;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String>s=new HashSet<>();
        for(String l:wordList) s.add(l);
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            Pair pp=q.poll();
            String ss=pp.p;
            int pratik=pp.v;
            if(ss.equals(endWord)){
                return pratik;
            } 
            for(int i=0;i<ss.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char []ch1=ss.toCharArray();
                    ch1[i]=ch;
                    String sharma=new String(ch1);
                    if(s.contains(sharma)){
                        s.remove(sharma);
                        q.add(new Pair(sharma,pratik+1));
                    }
                }
            }
        }
        return 0;
    }
}