class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int cnt=0;
        int i=0;
        while(i<pairs.length){
            cnt++;
            int curr=pairs[i][1];
            while(i<pairs.length && curr>=pairs[i][0]) i++;
        }
        return cnt;
    }
}