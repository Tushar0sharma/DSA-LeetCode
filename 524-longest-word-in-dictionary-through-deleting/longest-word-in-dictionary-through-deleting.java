class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res="";
        for(String str:dictionary){
            if(call(s,str)){
                if(res.length()<str.length()) res=str;
                else if(res.length()==str.length() && res.compareTo(str)>0) res=str;
            }
        }
        return res;
    }
    public boolean call(String s,String tar){
        int i=0;
        int j=0;
        while(j<tar.length()){
            if(i==s.length()) return false;
            if(tar.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return true;
    }
}