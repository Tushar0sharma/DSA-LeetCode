class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans=new ArrayList<>();
        int n=expression.length();
        for(int i=0;i<n;i++){
            if(expression.charAt(i)=='+'||expression.charAt(i)=='*'||expression.charAt(i)=='-'){
                List<Integer>l=diffWaysToCompute(expression.substring(0,i));
                List<Integer>r=diffWaysToCompute(expression.substring(i+1));
                for(int x:l){
                    for(int y:r){
                        if(expression.charAt(i)=='+'){
                            ans.add(x+y);
                        }
                        else if(expression.charAt(i)=='-'){
                            ans.add(x-y);
                        }
                        else {
                            ans.add(x*y);
                        }
                    }
                }
            }
        }
        if(ans.size()==0) ans.add(Integer.valueOf(expression));
        return ans;
    }
}