class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer>c=new LinkedList<Integer>();
        for(int i=1;i<=n;i++){
            c.add(i);
        }
        while(c.size()!=1){
            for(int i=0;i<k-1;i++){
                c.add(c.remove());
            }
            c.remove();
        }
        return c.peek();
    }
}