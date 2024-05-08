class Solution {
    public String[] findRelativeRanks(int[] score) {
        int []n=new int[score.length];
        int k=0;
        for(int i:score){
            n[k++]=i;
        }
        k=1;
        Arrays.sort(n);
        for(int i:n) System.out.print(i);
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=n.length-1;i>=0;i--){
            mp.put(n[i],k);
            k++;
        }
        System.out.print(mp);
        String[]res=new String[score.length];
        for(int i=0;i<n.length;i++){
            int pos=mp.get(score[i]);
            if(pos==1){
                res[i]="Gold Medal";
            }
            else if(pos==2){
                res[i]="Silver Medal";
            }
            else if(pos==3){
                res[i]="Bronze Medal";
            }
            else{
                res[i]=String.valueOf(pos);
            }
        }
        return res;
        
    }
}