class Solution {
    int xorsum ;
    public int subsetXORSum(int[] nums) {
        calculatexor(nums,0,0);
        return xorsum;
    }
    public void calculatexor(int[] nums,int curr,int currsum){
        if(curr == nums.length){
            return;
        }
        for(int i=curr;i<nums.length;i++){
            xorsum  += (currsum ^ nums[i]);
            calculatexor(nums,i+1,currsum^nums[i]);
        }
        return;
    }
}
