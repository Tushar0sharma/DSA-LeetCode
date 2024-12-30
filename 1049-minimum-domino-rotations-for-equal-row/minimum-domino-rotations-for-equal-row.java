class Solution {
    public int minDominoRotations(int[] a, int[] b) {
        int []cnta=new int[7];
        int []cntb=new int[7];
        int []same=new int[7];
        for(int i=0;i<a.length;i++){
            cnta[a[i]]++;
            cntb[b[i]]++;
            if(a[i]==b[i]) same[a[i]]++;
        }
        for(int i=1;i<7;i++){
            if(cnta[i]+cntb[i]-same[i]==a.length) return Math.min(cnta[i],cntb[i])-same[i];
        }
        return -1;
    }
}