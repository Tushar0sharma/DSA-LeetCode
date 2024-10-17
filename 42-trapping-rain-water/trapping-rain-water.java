class Solution {
    public int trap(int[] height) {
        Stack<Integer>s=new Stack<>();
        int trapmax=0;
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty() && height[i]>height[s.peek()]){
                int rm=i;
                int curr=s.pop();
                if(s.isEmpty()) break;
                int lm=s.peek();
                int width=rm-lm-1;
                trapmax+=width*(Math.min(height[lm],height[rm])-height[curr]);
            }
            s.push(i);
        }
        return trapmax;
    }
}