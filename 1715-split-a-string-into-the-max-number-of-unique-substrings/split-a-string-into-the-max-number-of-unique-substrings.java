class Solution {
    int max=0;
    public int maxUniqueSplit(String s) {
        Set<String>st=new HashSet<>();
        call(st,s);
        return max;
    }
    public void call(Set<String>st,String s){
        if(s.length()==0){
            max=Math.max(max,st.size());
            return;
        }
        for(int i=1;i<=s.length();i++){
            String k=s.substring(0,i);
            if(!st.contains(k)){
                st.add(k);
                call(st,s.substring(i));
                st.remove(k);
            }
        }
        return;
    }
}