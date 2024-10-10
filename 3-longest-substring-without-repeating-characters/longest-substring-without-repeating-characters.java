class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int ans=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            while(!mp.isEmpty() && mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)-1);
                if(mp.get(s.charAt(j))==0) mp.remove(s.charAt(j));
                j++;
            }
            ans=Math.max(ans,i-j+1);
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        return ans;
    }
}