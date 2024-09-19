class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer>[][]dp=new ArrayList[expression.length()][expression.length()];
        return call(expression,0,expression.length()-1,dp);
    }
    public List<Integer> call(String expression,int l1,int l2,List<Integer>[][]dp){        
        List<Integer>l=new ArrayList<>();
        if(dp[l1][l2]!=null) return dp[l1][l2];
        for(int i=l1;i<=l2;i++){
            if(expression.charAt(i)=='+'||expression.charAt(i)=='-'||expression.charAt(i)=='*'){
                List<Integer>left=call(expression,l1,i-1,dp);
                List<Integer>right=call(expression,i+1,l2,dp);
                
                for(Integer s:left){
                    for(Integer t:right){
                        if(expression.charAt(i)=='+'){
                            l.add(s+t);
                        }
                        else if(expression.charAt(i)=='-'){
                            l.add(s-t);
                        }
                        else{
                            l.add(s*t);
                        }
                    }
                }
            }
        }
        if(l.size()==0) l.add(Integer.parseInt(expression.substring(l1,l2+1)));
        dp[l1][l2]=l;
        return dp[l1][l2];
    }
}