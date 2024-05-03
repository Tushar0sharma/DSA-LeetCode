class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(String s:strs){
            if(s.length()==0) return "";
        }
        // System.out.print("svdd");
        String s="";
        Arrays.sort(strs);
        boolean fg=false;
        for(String k:strs) System.out.print(k+" ");
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    fg=true;
                    break;
                }
            }
            if(fg) break;
            s=s+strs[0].charAt(i);
        }
        return s;
    }
}