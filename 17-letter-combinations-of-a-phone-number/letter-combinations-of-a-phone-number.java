class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>l=new ArrayList<>();
        if(digits.length()==0) return l;
        String[]d={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        call(l,d,digits,"");
        return l;
    }
    public void call(List<String>l,String[]d,String digit,String ans){
        if(digit.length()==0){
            l.add(ans);
            return;
        }
        char ch=digit.charAt(0);
        String p=d[ch-'0'];
        for(int i=0;i<p.length();i++){
            call(l,d,digit.substring(1),ans+p.charAt(i));
        }
        return;
    }
}