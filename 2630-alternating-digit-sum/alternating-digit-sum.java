class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int i=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(i%2==0){
                ans+=ch-'0';
            }
            else{
                ans-=ch-'0';
            }
            i++;
        }
        return ans;
    }
}