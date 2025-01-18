class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>l=new ArrayList<>();
        if(nums.length==0) return l;
        int cnt1=0,cnt2=0,num1=nums[0],num2=nums[0];
        for(int i:nums){
            if(i==num1){
                cnt1++;
            }
            else if(i==num2) {cnt2++;}
            else if(cnt1==0){
                cnt1++;
                num1=i;
            }
            else if(cnt2==0){
                cnt2++;
                num2=i;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i:nums){
            if(i==num1) cnt1++;
            else if(i==num2) cnt2++;
        }
        if(cnt1>nums.length/3) l.add(num1);        
        if(cnt2>nums.length/3) l.add(num2);
        return l;
    }
}