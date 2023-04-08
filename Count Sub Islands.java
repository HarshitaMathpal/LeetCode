class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans = 0;
        int m = grid1.length;
        int n = grid1[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid1[i][j]==0){
                    dfs(i,j,m,n,grid2);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    dfs(i,j,m,n,grid2);
                    ans++;
                }
            }
        }
        return ans;
    }

    public void dfs(int i,int j,int m,int n,int[][] grid){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0)
            return ;
        
        grid[i][j] = 0;

        dfs(i,j-1,m,n,grid);                                 //left
        dfs(i,j+1,m,n,grid);                                 //right
        dfs(i-1,j,m,n,grid);                                 //up
        dfs(i+1,j,m,n,grid);                                 //down
    }    
}
