class Solution {
    
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int row=0;row<n;row++){
            if(grid[row][0]==1){
                dfs(row,0,n,m,grid);
            }
            if(grid[row][m-1]==1){
                dfs(row,m-1,n,m,grid);
            }
        }
        for(int col=0;col<m;col++){
            if(grid[0][col]==1){
                dfs(0,col,n,m,grid);
            }
            if(grid[n-1][col]==1){
                dfs(n-1,col,n,m,grid);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                    count++;
            }
        }

        return count;
    }

    public void dfs(int i,int j,int n,int m,int[][] grid){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
            return;
        }
        grid[i][j] = 0;

        dfs(i+1,j,n,m,grid);
        dfs(i-1,j,n,m,grid);
        dfs(i,j+1,n,m,grid);
        dfs(i,j-1,n,m,grid);
    }
}
