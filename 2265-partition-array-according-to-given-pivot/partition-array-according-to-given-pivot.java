class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        List<Integer>p=new ArrayList<>();
        for(int i:nums){
            if(i==pivot) p.add(i);
            else if(i>pivot) a.add(i);
            else l.add(i);
        }
        int []ans=new int[n];
        int k=0;
        for(int i:l) ans[k++]=i;
        for(int i:p) ans[k++]=i;
        for(int i:a) ans[k++]=i;
        return ans;
    }
}