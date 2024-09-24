class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        Set<String>s=new HashSet<>();
        for(int i=0;i<n;i++){
            String ss=arr1[i]+"";
            String prefix="";
            for(char ch:ss.toCharArray()){
                prefix+=ch;
                s.add(prefix);
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            String ss=arr2[i]+"";
            String prefix="";
            for(char ch:ss.toCharArray()){
                prefix+=ch;
                if(s.contains(prefix)) max=Math.max(max,(int)prefix.length());
            }
        }
        return max;
    }
}