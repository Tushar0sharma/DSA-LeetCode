class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int ans=0;
        Queue<Integer>q=new LinkedList<>();
        int []indeg=new int[numCourses];
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<numCourses;i++) ll.add(new ArrayList<>());
        for(int[]i:prerequisites){
            ll.get(i[1]).add(i[0]);
            indeg[i[0]]++;
        }
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int u=q.poll();
            ans++;
            for(int i:ll.get(u)){
                if(--indeg[i]==0) q.add(i);
            }
        }
        return ans==numCourses;
    }
}