class Solution {
    public int minLength(String s, int numOps) {
        int n=s.length();
        int l=1;
        int r=n;
        int ans=n;
        while(l<=r){
            int mid=(l+r)/2;
            if(ispossible(mid,s,numOps)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean ispossible(int mid,String s,int num){
        if(mid==1) return check(s,num,'1')||check(s,num,'0');
        int cnt=0,last=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==last) cnt++;
            else{
                num-=(cnt/(mid+1));
                last=s.charAt(i);
                cnt=1;
            }
        }
        if(cnt>mid) num-=(cnt/(mid+1));
        return num>=0;
    }
    public boolean check(String s,int num,char ch){
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)) num--;
            ch=(ch=='0') ? '1':'0';
        }
        return num>=0;
    }
}