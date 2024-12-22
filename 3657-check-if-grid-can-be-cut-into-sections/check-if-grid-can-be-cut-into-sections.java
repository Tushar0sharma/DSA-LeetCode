class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<int[]>l=call(rectangles,false);
        if(l.size()>=3) return true;
        List<int[]>ll=call(rectangles,true);
        if(ll.size()>=3) return true;
        return false;
    }
    public List<int[]> call(int [][]r,boolean hor){
        List<int[]>l=new ArrayList<>();
        for(int i[]:r){
            l.add(hor ? new int[]{i[0],i[2]} : new int[]{i[1],i[3]});
        }
        l.sort((a,b)->a[0]-b[0]);
        List<int[]>m=new ArrayList<>();
        for(int[]i:l){
            if(m.isEmpty() || m.get(m.size()-1)[1]<=i[0]) m.add(i);
            else m.get(m.size()-1)[1]=Math.max(i[1],m.get(m.size()-1)[1]);
        }
        return m;
    }
}