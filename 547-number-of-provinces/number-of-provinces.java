class Solution {
    public int findCircleNum(int[][] mat) {
        int n=mat.length;
        List<List<Integer>>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && mat[i][j]==1) l.get(i).add(j);
            }
        }
        boolean []vis=new boolean [n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                c++;
                call(vis,i,l);
            }
        }
        System.out.println(l);
        return c;
    }
    public void call(boolean []vis,int i,List<List<Integer>>l){
        vis[i]=true;
        for(int j:l.get(i)){
            if(!vis[j]) call(vis,j,l);
        }
    }
}