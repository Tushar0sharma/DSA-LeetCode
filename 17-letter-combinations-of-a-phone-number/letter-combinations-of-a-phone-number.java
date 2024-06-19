class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>l=new ArrayList<>();
        String[]dir={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()>0){
        call(dir,l,"",digits);
        }
        return l;
    }
    public void call(String[]d,List<String>l,String ans,String digit ){
        if(digit.length()==0){
            l.add(ans);
            return ;
        }
        char ch=digit.charAt(0);
        String p=d[ch-'0'];
        for(int i=0;i<p.length();i++){
            call(d,l,ans+p.charAt(i),digit.substring(1));
        }
        return ;
    }
}