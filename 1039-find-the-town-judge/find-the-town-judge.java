class Solution {
    public int findJudge(int n, int[][] trust) {
        int[]person=new int[n+1];
        if(n==1&&trust.length==0) return 1;
        for(int[] cnt:trust){
            person[cnt[0]]--;
            person[cnt[1]]++;
        }
        for(int i=0;i<person.length;i++){
            if(person[i]==n-1) return i;
        }
        return -1;        
    }
}