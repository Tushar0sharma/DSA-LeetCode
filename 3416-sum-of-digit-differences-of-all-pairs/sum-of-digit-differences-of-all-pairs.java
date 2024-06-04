class Solution {
    public long sumDigitDifferences(int[] nums) {
        if(nums.length<2){
            return 0;
        }

        int numdigit=String.valueOf(nums[0]).length();
        long[][] digitcnt=new long[numdigit][10];

        for(int num:nums){
            String numstr=String.valueOf(num);
            for(int i=0;i<numstr.length();i++){
                digitcnt[i][numstr.charAt(i)-'0']++;
            }
        }

        long total=0;

        for(int i=0;i<numdigit;i++){
            for(int d=0;d<10;d++){
                long cnt=digitcnt[i][d];
                total+=cnt*(nums.length-cnt);
            }
        }
        return total/2;
    }
}