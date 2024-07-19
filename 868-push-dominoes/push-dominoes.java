class Solution {
    public String pushDominoes(String s) {
        int n=s.length();
        int []l=new int[n];
        int []r=new int [n];
        char prev='.';
        int cnt=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                prev='R';
                cnt=1;
                continue;
            }
            else if(s.charAt(i)=='L' ) prev='L';
            if(prev=='R' && s.charAt(i)=='.') r[i]=cnt++;
        }
        cnt=1;
        prev='.';
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='L'){
                prev='L';
                cnt=1;
                continue;
            }
            else if(s.charAt(i)=='R'){
                prev='R';
            }
            if(prev=='L' && s.charAt(i)=='.') l[i]=cnt++;
        }
        String ans="";
        for(int i=0;i<n;i++){
            if(l[i]==0 && r[i]==0) ans+=s.charAt(i);
            else if(l[i]==0) ans+='R';
            else if(r[i]==0) ans+='L';
            else if(l[i]==r[i]) ans+='.';
            else if(l[i]>r[i]) ans+='R';
            else ans+='L';
        }
        return ans;
    }
}