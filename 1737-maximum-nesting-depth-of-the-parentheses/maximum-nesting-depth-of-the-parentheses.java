class Solution {
    public int maxDepth(String s) {
        int []left=new int[s.length()];
        int[]right=new int[s.length()];
        int suml=0;
        int sumr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                suml++;
            }
            left[i]=suml;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                sumr++;
            }
            right[i]=sumr;
        }
        int max=0;
        for(int i=0;i<s.length();i++){
            max=Math.max(max,left[i]-right[i]);
        }
        return max;
    }
}