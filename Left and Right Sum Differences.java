class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 0;
        for(int i=0;i<nums.length-1;i++){ 
            left[i+1] = left[i]+nums[i];
        }

        right[nums.length-1] = 0;

        for(int i=nums.length-1;i>0;i--){
            right[i-1] = right[i]+nums[i];
        }

        int[] ans = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(left[i]-right[i]);
        }

        return ans;
    }
}
