class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length+1];
        Arrays.fill(dp,-1);

        return minCost(days,0,costs,dp);
    }
    public static int minCost(int[] days,int currindx,int[] costs,int[] dp){
        if(currindx>=days.length)
            return 0;

        if(dp[currindx] != -1){
            return dp[currindx];
        }

        int day1Pass = costs[0] + minCost(days,currindx+1,costs,dp);
        int currDay;
        
        //find that index element in days array where currDay will become <= that day.
        for(currDay = currindx;currDay<days.length;currDay++){
            if(days[currDay] >= days[currindx]+7)
                break;
        }

        int day7Pass = costs[1] + minCost(days,currDay,costs,dp);

        for(currDay = currindx;currDay<days.length;currDay++){
            if(days[currDay] >= days[currindx]+30)
                break;
        }        

        int day30Pass = costs[2] + minCost(days,currDay,costs,dp);

        return dp[currindx] = Math.min(day1Pass,Math.min(day7Pass,day30Pass));
    }
}
