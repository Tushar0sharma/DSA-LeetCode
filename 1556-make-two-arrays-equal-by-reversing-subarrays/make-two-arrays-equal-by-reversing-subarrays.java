class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int []k=new int[1001];
        int []j=new int[1001];
        for(int i=0;i<arr.length;i++){
            k[arr[i]]++;
            j[target[i]]++;
        }
        for(int i=0;i<=1000;i++){
            if(k[i]!=j[i]) return false;
        }
        return true;
    }
}