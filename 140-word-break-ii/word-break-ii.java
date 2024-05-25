class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String>st=new HashSet<>(wordDict);
        List<String>result=new ArrayList<>();
        backtrack(0,result,st,s,new StringBuilder());
        return result;
    }
    public void backtrack(int i,List<String>result,Set<String>st,String s,StringBuilder curr){
        if(i==s.length()){
            result.add(curr.toString().trim());
            return;
        }
        for(int end=i+1;end<=s.length();end++){
            String word=s.substring(i,end);
            if(st.contains(word)){
                int currlen=curr.length();
                curr.append(word).append(" ");
                backtrack(end,result,st,s,curr);
                curr.setLength(currlen);
            }
        }
    }
}