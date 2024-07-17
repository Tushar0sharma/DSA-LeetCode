class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>ans=new ArrayList<>();
        List<Integer>[]g=new ArrayList[numCourses];
        int []deg=new int[numCourses];
        for(int i=0;i<numCourses;i++) g[i]=new ArrayList<Integer>();
        for(int []e:prerequisites){
            g[e[1]].add(e[0]);
            deg[e[0]]++;
        }
        for( int i=0;i<numCourses;i++) if(deg[i]==0) ans.add(i);
        for(int i=0;i<ans.size();i++){
            for(int j:g[ans.get(i)]){
                if(--deg[j]==0) ans.add(j);
            }
        }
        return ans.size()==numCourses;
    }
}