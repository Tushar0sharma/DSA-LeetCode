class MyQueue {
    Stack<Integer>s=new Stack<>();
    Stack<Integer>ss=new Stack<>();    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        peek();
        return ss.pop();
    }
    
    public int peek() {
        if(ss.isEmpty())
        while(!s.isEmpty()){
            ss.push(s.pop());
        }
        return ss.peek();
    }
    
    public boolean empty() {
        return s.isEmpty() && ss.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */