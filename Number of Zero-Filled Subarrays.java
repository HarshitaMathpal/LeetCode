class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum = 0;
        // int numOfZero = 0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                
                sum += count;
            }
            else{
                count=0;
            }
        }

        return sum;
    }
}
