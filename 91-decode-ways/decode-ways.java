class Solution {
    public int numDecodings(String s) {
        Map<String,Integer>mp=new HashMap<>();
        return call(s,mp);        
    }
    public int call(String s, Map<String,Integer>mp){
        if(s.length()==0){
            return 1;
        }
        if(mp.containsKey(s)) return mp.get(s);
        int res=0;
        for(int i=1;i<=2 && i<=s.length();i++){
            String k=s.substring(0,i);
            if(valid(k)){
                res+=call(s.substring(i),mp);
            }
        }
        mp.put(s,res);
        return res;
    }
    public boolean valid(String s){
        if(s.charAt(0)=='0') return false;
        long t=Long.parseLong(s);
        return t>=1&&t<=26;
    }
}