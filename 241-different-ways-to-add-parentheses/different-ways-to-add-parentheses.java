class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='+'||expression.charAt(i)=='-'||expression.charAt(i)=='*'){
                List<Integer>left=diffWaysToCompute(expression.substring(0,i));
                List<Integer>right=diffWaysToCompute(expression.substring(i+1));
                
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
        if(l.size()==0) l.add(Integer.parseInt(expression));
        return l;
    }
}