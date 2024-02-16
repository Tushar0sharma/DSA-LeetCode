class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        int mapsize=mpp.size();
        int[]a=new int[mapsize];
        int index=0;

        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            a[index++]=entry.getValue();
        }

        Arrays.sort(a);
        index=0;

        while(k>0){
            k-=a[index];
            if(k>=0) index++;
            else break;
        }
        return mapsize-index;
    }
}