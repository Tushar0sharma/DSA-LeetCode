class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int []arr=new int[256];
        for(char ch:stones.toCharArray()){
            arr[ch-'0']++;
        } 
        int cnt=0;
        for(char ch:jewels.toCharArray()){
            cnt+=arr[ch-'0'];
        }
        return cnt;
    }
}