class Solution {
    public List<String> letterCombinations(String digits) {
        String []d={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>ans=new ArrayList<>();
        if(digits.length()>0){
           print(ans,digits,"",d);
        }
        return ans;
        
    }
    static List<String> print(List<String>ans,String digits,String s,String[]d){
        if(digits.length()==0){
          ans.add(s);
          return ans;
        }
        char ch=digits.charAt(0);
        String p=d[ch-'0'];
        for(int i=0;i<p.length();i++){
            print(ans,digits.substring(1),s+p.charAt(i),d);
        }
        return ans;
    }
}