class Solution {
    public List<Integer> getRow(int row) {
        int[][]dp=new int[row+1][row+1];
        List<Integer> ans= new ArrayList<>();
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        for (int i = 0; i <= row; i++)
            {
                int c = pascal(row, i, dp);
                ans.add(c);
            }

            return ans;
    }
    public int pascal(int row,int col,int[][]dp){
        if(row==0 && col==0){
            return 1;
        }
        if(row<0 || col<0){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        if(col<=row){
            int x = pascal(row - 1, col - 1, dp);
            int y = pascal(row - 1, col, dp);
            dp[row][col] = x + y;
            return dp[row][col];
        }
        else{
            dp[row][col]= pascal(row - 1, col - 1,dp);
            return dp[row][col];
        }
        
    }
}
