class Solution {
    
    public String interpret(String command) {
        String ans=call("",command,0);
        return ans;
    }
    public String call(String ans,String c,int i){
        if(i>=c.length()){
            System.out.println(ans);
            return ans;
        }
        if(c.charAt(i)=='G'){
            ans=ans+'G';
        }
        if(i+1<c.length() && c.charAt(i)=='(' && c.charAt(i+1)==')'){
            ans=ans+'o';
        }
        if(i+3<c.length() && c.charAt(i)=='('&& c.charAt(i+1)=='a'&& c.charAt(i+2)=='l'&& c.charAt(i+3)==')'){
            ans=ans+'a'+'l';
        }
        return call(ans,c,i+1);
        
    }
}