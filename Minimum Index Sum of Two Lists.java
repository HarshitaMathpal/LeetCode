class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }
        HashMap<String,Integer> hm = new HashMap<>();
        // ArrayList<String> ans = new ArrayList<>();
        int indx = 0;
        for(int i=0;i<list1.length;i++){
            hm.put(list1[i],i);
        }
        List<String> ans = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String rest2 = list2[i];
            if (hm.containsKey(rest2)) {
                int sum = hm.get(rest2) + i;
                if (sum < minSum) {
                    ans = new ArrayList<>();
                    minSum = sum;
                }
                if (sum == minSum) {
                    ans.add(rest2);
                }
            }
        }
        return ans.toArray(new String[ans.size()]);
        
    }
}
