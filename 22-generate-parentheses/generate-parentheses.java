class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>l=new ArrayList<>();
        call(0,0,n,l,"");
        return l;
    }
    public void call(int o,int c,int n,List<String>l,String ans){
        if(o==c && o==n){
            l.add(ans);
            return ;
        }
        if(o<n){
            call(o+1,c,n,l,ans+"(");
        }
        if(c<o){
            call(o,c+1,n,l,ans+")");
        }
        return;
    }
}