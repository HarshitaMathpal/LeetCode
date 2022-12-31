class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> ans = new ArrayList<>(); 
        int maxcandy = 0;
        for(int i=0;i<candies.length;i++){
            maxcandy = Math.max(maxcandy,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            candies[i] += extra;
            if(candies[i]<maxcandy){
                ans.add(false);
            }
            else{
                ans.add(true);
            }
        }
        return ans;

    }
}
