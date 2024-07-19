class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int res=0;
        while(s<=e){
            if(people[s]+people[e]<=limit){
                res++;
                s++;
                e--;
            }
            else{
                e--;
                res++;
            }
        }
        return res;
    }
}