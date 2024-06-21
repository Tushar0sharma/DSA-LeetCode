class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>ans=new ArrayList<>();
        call(ans,s,"");
        return ans;
    }
    public void call(List<String>l,String s,String ss){
        if(s.length()==0){
            ss=ss.substring(0,ss.length()-1);
            System.out.println(ss);
            if(check(ss)){
                l.add(ss);
            }
            return;
        }
        for(int i=1;i<=s.length();i++){
            String k=s.substring(0,i);
            if(check1(k)){
                call(l,s.substring(i),ss+k+".");
            }
        }
        return;
    }
    public boolean check1(String s){
        if(s.length()>3) return false;
        if(Integer.parseInt(s)>255) return false;
        if(s.charAt(0)=='0' && s.length()!=1) return false;
        return true;

    }
    public boolean check(String s){
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='.') cnt++;
        }
        return cnt==3;
    }
}