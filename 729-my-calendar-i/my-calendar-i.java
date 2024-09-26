class MyCalendar {

    TreeMap<Integer,Integer>mp;
    public MyCalendar() {
        mp=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer floorkey=mp.floorKey(start);
        Integer ceilingkey=mp.ceilingKey(start);
        if(floorkey!=null && mp.get(floorkey)>start) return false;
        if(ceilingkey!=null && ceilingkey<end) return false;
        mp.put(start,end);   
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */