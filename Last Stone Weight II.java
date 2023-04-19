class Solution {
    public int lastStoneWeightII(int[] stones) {
        int tsum = 0;
        for(int i:stones){
            tsum += i;
        }
        int[][] dp = new int[stones.length][tsum];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }

        return lastWeight(stones,0,0,0,dp);
    }

    public static int lastWeight(int[] stones,int currIndex,int leftSum,int rightSum,int[][] dp){
        if(currIndex>=stones.length){
            return Math.abs(leftSum-rightSum);
        }

        if(dp[currIndex][leftSum] != -1){
            return dp[currIndex][leftSum];
        }

        if(dp[currIndex][rightSum] != -1){
            return dp[currIndex][rightSum];
        }

        int putLeft = lastWeight(stones,currIndex+1,leftSum+stones[currIndex],rightSum,dp);
        int putRight = lastWeight(stones,currIndex+1,leftSum,rightSum+stones[currIndex],dp);

        return dp[currIndex][leftSum] = Math.min(putLeft,putRight);
    }
}
