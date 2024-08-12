class Solution {
    public int reversePairs(int[] nums) {
        int n=nums.length;
        int a= call(nums,0,n-1);
        for(int i:nums) System.out.print(i+" ");
        return a;
    }
    public int call(int []nums,int s,int e){
        if(s>=e) return 0;
        int mid=(s+e)/2;
        int a=call(nums,s,mid);
        a+=call(nums,mid+1,e);
        a+=count(nums,s,mid,e);
        merge(nums,s,mid,e);
        return a;
    }
    public int count(int []nums,int s,int mid,int e){
        int c=0;
        int j=mid+1;
        for(int i=s;i<=mid;i++){
            while(j<=e && nums[i]>((long)nums[j]*2)) j++;
            c+=(j-(mid+1));
        }
        return c;
    }
    public void merge(int []nums,int s,int mid,int e){
        int i=s;
        int j=mid+1;
        List<Integer>l=new ArrayList<>();
        while(i<=mid && j<=e){
            if(nums[i]<=nums[j]) l.add(nums[i++]);
            else l.add(nums[j++]);
        }
        while(i<=mid) l.add(nums[i++]);
        while(j<=e) l.add(nums[j++]);
        for(int m=s;m<=e;m++) nums[m]=l.get(m-s);
    }
}
