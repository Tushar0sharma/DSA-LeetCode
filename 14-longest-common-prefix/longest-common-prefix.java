class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(String s:strs){
            if(s.length()==0) return "";
        }
        // System.out.print("svdd");
        String s="";
        Arrays.sort(strs);
        String k1=strs[0];
        String k2=strs[strs.length-1];
        for(int i=0;i<k1.length();i++){
            if(k1.charAt(i)==k2.charAt(i)){
                s=s+k1.charAt(i);
            }
            else{ 
                break;
            }
        }
        return s;
    }
}