class Solution {
    public int minDeletions(String s) {
        int []cnt=new int[26];
        for(char ch:s.toCharArray()){
            cnt[ch-97]++;
        }
        Set<Integer>st=new HashSet<>();
        int ans=0;
        for(int num:cnt){
            while(num>0){
                if(!st.contains(num)){
                    st.add(num);
                    break;
                }
                ans++;
                num--;
            }
        }
        return ans;
    }
}