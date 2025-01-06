class Solution {
    public String smallestString(String s) {
        int n=s.length();
        int i=0;
        int a=-1;
        int b=-1;
        boolean flag=true;
        while(i<n){
            if(s.charAt(i)=='a'){
                if(!flag) break;
                i++;
            }
            else{
                if(flag) a=i; 
                b=i;
                i++;
                flag=false;
            }
        }
        i=0;
        StringBuilder ans=new StringBuilder();
        if(a==-1){
            ans.append(s.substring(0,n-1));
            ans.append("z");
            return ans.toString();
        }
        while(i<n){
            if(i>=a && i<=b){
                ans.append((char)(s.charAt(i)-'a'-1+'a'));
                i++;
            }
            else
            ans.append(s.charAt(i++));
        }
        return ans.toString();
    }
}