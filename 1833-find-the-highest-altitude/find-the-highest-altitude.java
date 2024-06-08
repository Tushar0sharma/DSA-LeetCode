class Solution {
    public int largestAltitude(int[] gain) {
        int []altitudes=new int[gain.length+1];
        altitudes[0]=0;
        int i=1;
        for(int num:gain){
            int sum=altitudes[i-1]+num;
            altitudes[i++]=sum;
        }
        Arrays.sort(altitudes);
        return altitudes[altitudes.length-1];
    }
}