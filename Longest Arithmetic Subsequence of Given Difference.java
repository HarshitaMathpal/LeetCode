class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int longestSub = 0; 
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i]-difference,0)+1);
            longestSub = Math.max(longestSub,hm.get(arr[i])); 
        }

        return longestSub;
    }
}
