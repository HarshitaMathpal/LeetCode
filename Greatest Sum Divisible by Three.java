class Solution {
    public int maxSumDivThree(int[] nums) {
        int[][] dp = new int[nums.length][3];             //3 because we have 3 remainder 0,1,2
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }

        return findSum(nums,0,0,nums.length,dp);
    }
    
    public static int findSum(int[] nums,int currindx,int currRemainder,int len,int[][] dp){
        if(currindx >= nums.length){
            if(currRemainder==0)                                     //sum is divisible by 3
                return 0;
            return -10000;
        }

        if(dp[currindx][currRemainder] != -1){
                return dp[currindx][currRemainder];
        }

        int take = nums[currindx] + findSum(nums,currindx+1,(currRemainder+nums[currindx])%3,len,dp);
        int notake = findSum(nums,currindx+1,currRemainder,len,dp);

        return dp[currindx][currRemainder] = Math.max(take,notake);
    }
}
