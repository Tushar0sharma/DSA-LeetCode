class Solution {
    public int slidingPuzzle(int[][] board) {
        int [][]dir={{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        String target="123450";
        String start="";
        for(int []i:board){
            for(int j:i) start+=j;
        }
        Set<String>vis=new HashSet<>();
        Queue<String>q=new LinkedList<>();
        int ans=0;
        q.add(start);
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                String p=q.poll();
                if(p.equals(target)) return ans;
                int zeropos=p.indexOf('0');
                for(int i:dir[zeropos]){
                    String news=swap(p,zeropos,i);
                    if(vis.contains(news)) continue;
                    vis.add(news);
                    q.add(news);
                }
            }
            ans++;
        }
        return -1;
    }
    public String swap(String p,int i,int j){
        char []ch=p.toCharArray();
        char t=ch[i];
        ch[i]=ch[j];
        ch[j]=t;
        return new String(ch);
    }
}