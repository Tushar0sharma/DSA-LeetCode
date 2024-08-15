class Solution {
    public boolean lemonadeChange(int[] bills) {
        int s=0;
        int []a=new int[3];
        for(int i:bills){
            if(i==5) a[0]++;
            else if(i==10){
                if(a[0]==0) return false;
                a[0]--;
                a[1]++;
            }
            else{
                if(a[0]==0) return false;
                if(a[1]==0 && a[0]<3) return false;
                if(a[0]>2 && a[1]==0) a[0]-=3;
                else{
                a[0]--;
                a[1]--;
                }
            }
        }
        return true;
    }
}