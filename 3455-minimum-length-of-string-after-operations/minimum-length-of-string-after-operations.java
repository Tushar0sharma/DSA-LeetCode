class Solution {
    public int minimumLength(String s) {
        int []arr=new int[26];
        int ans=0;
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
            if(arr[ch-'a']==3){
                ans-=2;
                arr[ch-'a']=1;
            }
            ans++;
        }
        return ans;
    }
}