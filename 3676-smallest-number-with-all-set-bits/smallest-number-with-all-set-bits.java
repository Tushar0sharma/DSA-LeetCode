class Solution {
    public int smallestNumber(int n) {
        int a=1;
        int num=1;
        while(num<n){
            a*=2;
            num=num+a;
        }
        return num;
    }
}