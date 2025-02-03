class Solution {
    public int findMinArrowShots(int[][] points) {
        List<int[]>l=new ArrayList<>();
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        for(int i[]:points){
            if(l.isEmpty() || l.get(l.size()-1)[1]<i[0]){
                l.add(i);
            }
            else {
                l.get(l.size()-1)[1]=Math.min(l.get(l.size()-1)[1],i[1]);
            }
        }
        for(int []i:l) System.out.println(Arrays.toString(i));
        return l.size();
    }
}