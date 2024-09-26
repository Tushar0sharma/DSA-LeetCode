class MyCalendar {
    class Node{
        int st;
        int en;
        Node left;
        Node right;
        Node(int st,int en){
            this.st=st;
            this.en=en;
        }
    }
    Node root;

    public MyCalendar() {
         root=null;
    }
    
    public boolean book(int start, int end) {
        if(root==null) {
            root=new Node(start,end);
            return true;
        }
        Node curr=root;
        while(curr!=null){
            if(end<=curr.st){
                if(curr.left==null){
                    curr.left=new Node(start,end);;
                    return true;
                }
                else curr=curr.left;
            }
            else if(start>=curr.en){
                if(curr.right==null){
                    curr.right=new Node(start,end);;
                    return true;
                }
                else curr=curr.right;
            }
            else return false;
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */