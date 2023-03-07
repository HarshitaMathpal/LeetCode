class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        int diff = Math.abs(nums[0]-0);
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i]-0)<=diff){
                diff=Math.abs(nums[i]-0);
                num = nums[i];
            }

        }
        return num;
    }
}
