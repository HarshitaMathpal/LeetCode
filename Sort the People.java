class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j=0;
        for(int i=n-1;i>=0;i--){
            names[j] = hm.get(heights[i]);
            j++;
        }
        return names;
    }
}
