class MyCalendarTwo {
    TreeMap<Integer,Integer>mp;

    public MyCalendarTwo() {
        mp=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        mp.put(start,mp.getOrDefault(start,0)+1);
        mp.put(end,mp.getOrDefault(end,0)-1);
        int cnt=0;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            cnt+=entry.getValue();
            if(cnt>2){
                mp.put(start,mp.get(start)-1);
                if(mp.get(start)==0) mp.remove(start);
                mp.put(end,mp.get(end)+1);
                if(mp.get(end)==0) mp.remove(end);
                return false;
            }
        }
        return true;        
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */