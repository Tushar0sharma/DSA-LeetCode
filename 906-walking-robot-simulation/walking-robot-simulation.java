class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String>s1=new HashSet<>();
        for(int []i:obstacles){
            s1.add(i[0]+" "+i[1]);
        }
        int [][]dir={{0,1},{1,0},{0,-1},{-1,0}};
        int ans=0;
        int currdir=0;
        
        int x=0;
        int y=0;

        for(int i:commands){
            if(i==-1){
                currdir=(currdir+1)%4;
                continue;
            }
            if(i==-2) {
                currdir=(currdir+3)%4;
                continue;
            }

            int []d=dir[currdir];
            for(int j=0;j<i;j++){
                int nx=x+d[0];
                int ny=y+d[1];
                if(s1.contains(nx+" "+ny)){
                    break;
                }
                x=nx;
                y=ny;
            }
            ans=Math.max(ans,(x*x)+(y*y));
        }
        return ans;
    }
}