class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k=flowerbed.length;
        if(k==1){
            if(flowerbed[0]==0){
            n-=1;
            }
            return n<=0;
        }
        // int idx=0;
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n-=1;
        }
        for(int i=1;i<k-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
            flowerbed[i]=1;
               n-=1;
            }
        }
        if(flowerbed[k-2]==0 && flowerbed[k-1]==0){
            n-=1;
        }
        return n<=0;
    }
}