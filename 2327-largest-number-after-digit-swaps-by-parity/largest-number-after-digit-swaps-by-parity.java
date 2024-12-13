class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer>even=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>odd=new PriorityQueue<>(Collections.reverseOrder());
        String k=num+"";
        while(num>0){
            int a=num%10;
            if(a%2==0) even.add(a);
            else odd.add(a);
            num=num/10;
        }
        String s="";
        for(int i=0;i<k.length();i++){
            int a=k.charAt(i)-'0';
            if(a%2==0) s+=even.poll();
            else s+=odd.poll();
        }
        return Integer.parseInt(s);
    }
}