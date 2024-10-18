class Solution {
    String[]d={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        call(digits,ans,"",0);
        return  ans;
    }
    public void call(String digit,List<String>ans,String a,int i){
        if(i==digit.length()) {
            ans.add(a);
            return ;
        }
        String p=d[digit.charAt(i)-'0'];
        for(int j=0;j<p.length();j++){
            call(digit,ans,a+p.charAt(j),i+1);
        }
    }
}