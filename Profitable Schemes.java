class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][][] dp = new int[n+1][group.length+1][minProfit+1];

        for(int[][] a:dp){
            for(int[] b:a){
                Arrays.fill(b,-1);
            }
        }

        return findMaxWays(n,0,minProfit,group,profit,dp);
    }

    public static int findMaxWays(int n,int currindx,int leftprofit,int[] group,int[] profit,int[][][] dp){
        if(currindx == group.length){
                return leftprofit==0 ? 1:0;
        }

        if(dp[n][currindx][leftprofit] != -1){
            return dp[n][currindx][leftprofit];
        }

        //no taking person for crime only increasing index of the group
        int notake = findMaxWays(n,currindx+1,leftprofit,group,profit,dp);
        int take = 0;

        // checking whether group are left for crime or not then decreasing left profit if it become negative put zero in that.
        if(n>=group[currindx]){
            take = findMaxWays(n-group[currindx],currindx+1,Math.max(leftprofit-profit[currindx],0),group,profit,dp);
        }

        int ans = take+notake;

        return dp[n][currindx][leftprofit] = ans % 1000000007;
    }
}
