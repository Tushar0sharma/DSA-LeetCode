class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0,j=num.length-1;
        while(num[i]+num[j]!=target){
            if(num[i]+num[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}