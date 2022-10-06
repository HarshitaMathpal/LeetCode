class TimeMap {
    HashMap<String,TreeMap<Integer,String>> hm ;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key))
            hm.put(key,new TreeMap<>());

        
        hm.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if (!hm.containsKey(key))
            return "";
        TreeMap<Integer, String> map = hm.get(key);
        Integer floorKey = map.floorKey(timestamp);
        return floorKey == null ? "" : map.get(floorKey);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
