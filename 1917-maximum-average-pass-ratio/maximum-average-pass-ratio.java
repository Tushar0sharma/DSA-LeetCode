class pair{
    double ratio;
    int pass;
    int total;
    pair(int pass,int total,double ratio){
        this.pass=pass;
        this.total=total;
        this.ratio=ratio;
    }
}
class Solution {
    public double gain(int pass,int total){
        return (double)(pass+1)/(total+1)-(double)pass/total;
    }
    public double maxAverageRatio(int[][] classes, int k) {
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->Double.compare(b.ratio,a.ratio));
        for(int []c:classes){
            pq.add(new pair(c[0],c[1],gain(c[0],c[1])));
        }
        while(k-->0){
            pair p=pq.poll();
            int pp=p.pass;
            int tt=p.total;
            pq.add(new pair(pp+1,tt+1,gain(pp+1,tt+1)));
        }
        double sum=0;
        while(!pq.isEmpty()){
            pair p=pq.poll();
            sum+=(double)p.pass/p.total;
        }
        return sum/classes.length;
    }
}