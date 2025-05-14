class Solution {
    public String countAndSay(int n) {
        String s=rle(n,"1");
        return s;
    }
    public String rle(int n,String s){
        if(n==1){
            return s;
        }
        int cnt=1;
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<s.length();j++){
            while(j+1<s.length() && s.charAt(j)==s.charAt(j+1)){
                cnt++;
                j++;
            }
            sb.append(cnt).append(s.charAt(j));
            cnt=1;
            
        }
        return rle(n-1,sb.toString());
    }
}