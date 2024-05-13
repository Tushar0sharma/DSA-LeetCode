class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int []ans=new int[queries.length];
        int j=0;
        for(String i:queries){
            int cnt=0;
            int l1=len(i);
            for(String k:words){
                int l2=len(k);
                if(l1<l2){
                    cnt++;
                }
            }
            ans[j++]=cnt;
        }
        return ans;
    }
    public int len(String s){
        char[]arr=new char[s.length()];
        int i=0;
        Map<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            arr[i++]=ch;
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        Arrays.sort(arr);
        return mp.get(arr[0]);
    }
}