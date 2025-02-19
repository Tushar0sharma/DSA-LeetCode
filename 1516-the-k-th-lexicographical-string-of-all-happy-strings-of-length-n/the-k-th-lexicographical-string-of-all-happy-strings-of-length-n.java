class Solution {
    String ans="";
    int kk=-1;
    public String getHappyString(int n, int k) {
        kk=k;
        call("",n);
        return ans;
    }
    public void call(String a,int n){
        if(n==0){
            kk--;
            if(kk==0) ans=a;
            return ;
        }
        if(a.length()==0 || a.charAt(a.length()-1)!='a'){
            call(a+"a",n-1);
        }
        if(a.length()==0 ||a.charAt(a.length()-1)!='b'){
            call(a+"b",n-1);
        }if(a.length()==0 ||a.charAt(a.length()-1)!='c'){
            call(a+"c",n-1);
        } 
    }
}