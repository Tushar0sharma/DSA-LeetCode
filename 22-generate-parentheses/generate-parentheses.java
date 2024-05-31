class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>l=new ArrayList<>();
        call(0,0,"",l,n);
        return l;
    }
    public void call(int o,int c,String ans,List<String>l,int n){
        if(o==n && c==n){
            l.add(ans);
            return;
        }
        if(o<n){
            call(o+1,c,ans+'(',l,n);
        }
        if(c<o){
            call(o,c+1,ans+')',l,n);
        }
    }
}