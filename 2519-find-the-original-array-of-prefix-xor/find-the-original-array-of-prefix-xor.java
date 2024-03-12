class Solution {
    public int[] findArray(int[] pref) {
        int arr=pref[0];
        for(int i=1;i<pref.length;i++){
            pref[i]^=arr;
            arr^=pref[i];
        }
        return pref;
    }
}