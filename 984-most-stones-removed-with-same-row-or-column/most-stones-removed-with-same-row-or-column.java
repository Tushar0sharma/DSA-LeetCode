class Solution {
    public int removeStones(int[][] stones) {
        int maxr=0;
        int maxc=0;
        int n=stones.length;
        for(int []i:stones){
            maxr=Math.max(maxr,i[0]);
            maxc=Math.max(maxc,i[1]);
        }
        int []par=new int[maxr+maxc+2];
        int []size=new int[maxr+maxc+2];
        for(int i=0;i<=maxr+maxc+1;i++){
            par[i]=i;
            size[i]=1;
        }
        Set<Integer>s=new HashSet<>();
        for(int[] i:stones){
            int r=i[0];
            int c=i[1]+maxr+1;
            union(r,c,par,size);
            s.add(r);
            s.add(c);
        }
        int cnt=0;
        for(int i:s){
            if(find(par,i)==i) cnt++;
        }
        return n-cnt;        
    }
    public int find(int []par,int u){
        if(u==par[u]) return u;
        return par[u]=find(par,par[u]);
    }
    public void union(int x,int y,int []par,int []size){
        int ux=find(par,x);
        int uy=find(par,y);
        if(ux==uy) return;
        if(size[ux]>size[uy]){
            par[uy]=ux;
            size[ux]+=size[uy];
        }else{
            par[ux]=uy;
            size[uy]+=size[ux];
        }
        return ;
    }
}