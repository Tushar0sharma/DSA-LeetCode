class Solution {
    boolean []prime=new boolean[10000];
    public void seive(){
        Arrays.fill(prime,true);
        for(int i=2;i*i<10000;i++){
            if(prime[i]){
                for(int j=i*i;j<10000;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
    public int minOperations(int n, int m) {
        seive();
        if(prime[n] && n>1) return -1;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{n,n});
        boolean []vis=new boolean[10000];
        vis[n]=true;
        while(!pq.isEmpty()){
            int []p=pq.poll();
            if(p[0]==m) return p[1];

            char []ch=Integer.toString(p[0]).toCharArray();
            for(int i=0;i<ch.length;i++){
                char curr = ch[i];
                if(curr=='0'){
                    ch[i]='1';
                    int idx=Integer.parseInt(new String(ch));
                    if(!vis[idx] && !prime[idx]){
                        vis[idx]=true;
                        pq.add(new int []{idx,p[1]+idx});
                    }
                }
                else if(curr=='9'){
                    ch[i]='8';
                    int idx=Integer.parseInt(new String(ch));
                    if(!vis[idx] && !prime[idx]){
                        vis[idx]=true;
                        pq.add(new int []{idx,p[1]+idx});
                    }
                }
                else{
                    ch[i]=(char)(curr-1);
                    int idx=Integer.parseInt(new String(ch));
                    if(!vis[idx] && !prime[idx]){
                        vis[idx]=true;
                        pq.add(new int []{idx,p[1]+idx});
                    }
                    
                    ch[i]=(char)(curr+1);
                    int idx1=Integer.parseInt(new String(ch));
                    if(!vis[idx1] && !prime[idx1]){
                        vis[idx1]=true;
                        pq.add(new int []{idx1,p[1]+idx1});
                    }
                }
                ch[i]=curr;
            }
        }
        return -1;
    }
}