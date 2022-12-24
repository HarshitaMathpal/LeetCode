class Solution {
    public List<List<Integer>> generate(int row) {
        int[][]dp=new int[row][row];
        List<List<Integer>> answer= new ArrayList<>();
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        for(int i=0;i<row;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int j=0;j<=i;j++){
                int res=pascal(i,j,dp);
                arr.add(res);
            }
            answer.add(arr);
        }
        return answer;
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
