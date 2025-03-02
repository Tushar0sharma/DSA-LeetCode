class RandomizedSet {
    Map<Integer,Integer>mp;
    List<Integer>l;
    public RandomizedSet() {
        l=new ArrayList<>();
        mp=new HashMap<>();
    }

    public boolean insert(int val) {
        if(mp.containsKey(val)) return false;
        l.add(val);
        mp.put(val,l.size()-1);
        return true;        
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)) return false;
        int idx=mp.get(val);
        l.set(idx,l.get(l.size()-1));
        mp.put(l.get(l.size()-1),idx);
        l.remove(l.size()-1);
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand=new Random();
        return l.get(rand.nextInt(l.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */