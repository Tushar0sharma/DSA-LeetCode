class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String,Integer>mp=new HashMap<>();
        for(int []i:matrix){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<i.length;j++){
                sb.append(i[0]==i[j]?'T':'F');
            }
            mp.put(sb.toString(),mp.getOrDefault(sb.toString(),0)+1);
        }
        int max=0;
        for(int i:mp.values()) max=Math.max(max,i);
        return max;
    }
}