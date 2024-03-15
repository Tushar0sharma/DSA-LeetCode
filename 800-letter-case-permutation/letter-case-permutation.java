class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>l=new ArrayList<>();
        addition(l,s,0,"");
       return l; 
    }
    public void addition(List<String>l,String s,int i,String ans){
        if(i>=s.length()){
            l.add(ans);
            return;
        }
        char ch=s.charAt(i);
        addition(l,s,i+1,ans+ch);
        if(Character.isLetter(ch)){
           addition(l,s,i+1,ans+(Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch))) ;           
        }
    }
}