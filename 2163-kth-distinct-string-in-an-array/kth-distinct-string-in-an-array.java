class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer>s=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(s.containsKey(arr[i])){
                s.put(arr[i],-1);
            }
            else
            s.put(arr[i],i);
        }
        String []a=new String[1001];
        for(String ss:s.keySet()){
            if(s.get(ss)==-1) continue;
            else a[s.get(ss)]=ss;
        }
        int e=0;
        for(String gg:a){
            if(gg==null) continue;
            else{
                e++;
                if(e==k) return gg;
            }
        }
        return "";
    }
}