class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        List<double[]>l=new ArrayList<>();
        int n=wage.length;
        for(int i=0;i<n;i++){
            l.add(new double[]{(double)wage[i]/quality[i],(double)quality[i]});
        }
        Collections.sort(l,(a,b)->Double.compare(a[0],b[0]));
        double ans=Double.MAX_VALUE,sum=0;
        PriorityQueue<Double>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(double[]i:l){
            sum+=i[1];
            pq.add(i[1]);
            if(pq.size()>k) sum-=pq.poll();
            if(pq.size()==k) ans=Math.min(ans,sum*i[0]);
        }
        return ans;
    }
}