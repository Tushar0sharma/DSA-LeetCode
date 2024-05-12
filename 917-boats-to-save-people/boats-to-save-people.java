class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int cnt=0;
        int start=0;
        int end=people.length-1;
        while(start<=end){
            int s=people[start]+people[end];
            if(s<=limit){
                cnt++;
                start++;
                end--;
            }
            else{
                end--;
                cnt++;
            }
        }
        return cnt;
    }
}