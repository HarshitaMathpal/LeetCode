class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int startidx=0;
        int endidx=0;
        int zero=0;
        int max=0;
        while(endidx<n){
            if(nums[endidx]==0){
                zero++;
            }
        
            if(zero>k){
                while(zero>k && startidx<=endidx){
                    if(nums[startidx]==0){
                        zero--;
                    }   
                    startidx++;
                }
            }
            max=Math.max(max,endidx-startidx+1);
            endidx++;
            }
            return max;
    }
}
