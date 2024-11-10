class MedianFinder {

    PriorityQueue<Integer>pq1;
    PriorityQueue<Integer>pq2;

    public MedianFinder() {
        pq1=new PriorityQueue<>();
        pq2=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        pq2.add(num);
        pq1.add(pq2.poll());
        if(pq1.size()>pq2.size()){
            pq2.add(pq1.poll());
        }        
    }
    
    public double findMedian() {
        if(pq1.size()<pq2.size()) return pq2.peek();
        return (pq1.peek()+pq2.peek())/2.0d;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */