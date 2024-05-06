class pair{
    int x;
    int y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class MinStack {
        Stack<pair>st;
        int min;
    public MinStack() {
        st=new Stack<>();    
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            min=val;
        }
        else if(st.peek().y>val){
            min=val;
        }
        else {
            min=st.peek().y;
        }
        st.add(new pair(val,min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
        return st.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */