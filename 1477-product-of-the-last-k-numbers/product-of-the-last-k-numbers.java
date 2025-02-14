class ProductOfNumbers {
    List<Integer>pre=new ArrayList<>();
    int prod=1;    
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        if(num==0){
            prod=1;
            pre.clear();
        }
        else{
            prod*=num;
            pre.add(prod);
        }
    }
    
    public int getProduct(int k) {
        if(k>pre.size()) return 0;
        int last=pre.size()-1;
        if(k==pre.size()) return pre.get(last);
        return pre.get(last)/pre.get(last-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */