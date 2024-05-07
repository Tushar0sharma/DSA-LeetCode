class Solution {
    public int nextBeautifulNumber(int n) {
        int x=n+1;
        while(!isBalanced(x)){
            x++;
        }
        return x;
    }
    public boolean isBalanced(int x){
        int temp= x;
        int []t=new int[10];
        Arrays.fill(t,0);

        while(temp!=0){
            t[temp%10]+=1;
            if(t[temp%10]>temp%10) return false;
            temp=temp/10;
        }

        for(int i=0;i<10;i++){
            if(t[i]!=0 && t[i]!=i){
                return false;
            }
        }
        return true;
    }
}