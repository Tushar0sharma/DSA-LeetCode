class Node{
    int val;
    int key;
    Node next;
    Node prev;
    Node(int val,int key){
        this.val=val;
        this.key=key;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
    Map<Integer,Node>mp;
    int c;
    Node head;Node tail;
    public LRUCache(int capacity) {
        c=capacity;
        mp=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        Node n=mp.get(key);
        delete(n);
        add(n);
        return n.val;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node t=mp.get(key);
            t.val=value;
            delete(t);
            add(t);
        }
        else {
            if(c==mp.size()){
                Node p=tail.prev;
                mp.remove(p.key);
                delete(p);
            }
            Node n=new Node(value,key);
            add(n);
            mp.put(key,n);
        }
    }
    public void delete(Node n){
        Node pp=n.prev;
        Node nn=n.next;
        pp.next=nn;
        nn.prev=pp;
    }
    public void add(Node n){
        Node nn=head.next;
        head.next=n;
        n.prev=head;
        n.next=nn;
        nn.prev=n;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */