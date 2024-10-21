class Solution {
    int max=0;
    public int maxUniqueSplit(String s) {
        Set<String>st=new HashSet<>();
        call(s,st);
        return max;
    }
    public void call(String s,Set<String>st){
        if(s.length()==0){
            System.out.println(st);
            max=Math.max(max,st.size());
            return;
        }
        for(int i=1;i<=s.length();i++){
            String a=s.substring(0,i);
            if(!st.contains(a)){
                st.add(a);
                call(s.substring(i),st);
                st.remove(a);
            }
        }
    }
}