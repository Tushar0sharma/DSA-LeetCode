class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int []l=new int[52];
        for(int i[]:ranges){
            l[i[0]]++;
            l[i[1]+1]--;
        }
        int overlap=0;
        for(int i=0;i<=right;i++){
            overlap+=l[i];
            if(i>=left && overlap==0) return false;
        }
        return true;
    }
}