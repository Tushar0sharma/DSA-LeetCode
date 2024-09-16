class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int []time=new int[n];
        int k=0;
        for(String s:timePoints){
            int a=Integer.parseInt(s.substring(0,2));
            int b=Integer.parseInt(s.substring(3,5));
            time[k]=a*60+b;
            k++;
        }
        Arrays.sort(time);
        int min=2000;
        for(int i=0;i<n-1;i++){
            min=Math.min(min,Math.abs(time[i]-time[i+1]));
        }
        min=Math.min(min,24*60-Math.abs(time[n-1]-time[0]));
        return min;
    }
}