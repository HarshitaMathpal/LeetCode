class MyCalendarThree {
    TreeMap<Integer,Integer> tree ;
    public MyCalendarThree() {
        tree = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        tree.put(start,tree.getOrDefault(start,0)+1);
        tree.put(end,tree.getOrDefault(end,0)-1);
        
        int activeB = 0;
        int maxactiveB = 0;
        
        for(int event : tree.values()){
            activeB += event;
            maxactiveB = Math.max(activeB,maxactiveB);
        }
        return maxactiveB;
    }
}
