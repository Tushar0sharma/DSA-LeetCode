class Solution {
    public int find(int p,int []par){
        if(par[p]==p) return p;
        return par[p]=find(par[p],par);
    }
    public void union(int u,int v,int []par,int []size){
        int pu=find(u,par);
        int pv=find(v,par);
        if(pu==pv) return;
        if(size[pu]>size[pv]){
            par[pv]=pu;
            size[pu]+=size[pv];
        }
        else{
            par[pu]=pv;
            size[pv]+=size[pu];
        }
    }

    public int countComponents(int[] nums, int threshold) {
        Arrays.sort(nums);
        Map<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],i);
        }
        int []par=new int[n];
        int []size=new int[n];
        for(int i=0;i<n;i++){
            par[i]=i;
            size[i]=1;
        }
        for(int i=1;i<=threshold;i++){
            int val=-1;
            for(int j=i;j<=threshold;j+=i){
                if(mp.containsKey(j)){
                    int idx=mp.get(j);
                    if(val==-1){
                        val=idx;
                    }
                    else{
                        long a=nums[idx];
                        long b=nums[val];
                        long gcd=gcd(a,b);
                        long lcm=(a/gcd)*b;
                        if(lcm<=threshold){
                            union(idx,val,par,size);
                        }
                    }
                }
            }
        }
        Set<Integer>s=new HashSet<>();
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(size));
        for(int i=0;i<n;i++) s.add(find(i,par));
        return s.size();
    }
    public long gcd(long a,long b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}