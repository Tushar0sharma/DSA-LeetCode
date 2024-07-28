class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,Map<String,Double>>mp=new HashMap<>();
        int k=0;
        for(List<String>l:equations){
            mp.putIfAbsent(l.get(0),new HashMap<>());
            mp.putIfAbsent(l.get(1),new HashMap<>());
            mp.get(l.get(0)).put(l.get(1),values[k]);
            mp.get(l.get(1)).put(l.get(0),1.0/values[k]);
            k++;
        }
        // System.out.println(mp);

        double[]ans=new double[queries.size()];
        k=0;
        for(List<String>l:queries){
            if(!mp.containsKey(l.get(0)) || !mp.containsKey(l.get(1))){
                ans[k++]=-1.0;
            }
            else{
                HashSet<String>vis=new HashSet<>();
                double []a={-1.0};
                double temp=1.0;
                dfs(a,temp,mp,vis,l.get(0),l.get(1));
                ans[k++]=a[0];
            }
        }
        return ans;
    }
    public void dfs(double[]a,double temp,Map<String,Map<String,Double>>mp,HashSet<String>vis,String node,String dest){
        if(vis.contains(node)) return ;
        vis.add(node);

        if(node.equals(dest)){
            a[0]=temp;
            return;
        }
        for(Map.Entry<String,Double>m:mp.get(node).entrySet()){
            String ne=m.getKey();
            Double t=m.getValue();
            dfs(a,temp*t,mp,vis,ne,dest);
        }

    }
}