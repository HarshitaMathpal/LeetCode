class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return dfs(i,j,grid,m);
                }
            }
        }
        return false;
        // return dfs(i,j,grid);
    }
    
    private boolean dfs(int i,int j,int[][] grid,int n ){
        
        
        
        if(i<0 || i>=n || j<0 || j>=n || grid[i][j]==0) return false;
        if(grid[i][j]==2) return true;
        grid[i][j]=0;
        
        boolean found=dfs(i-1,j,grid,n);
        found=found || dfs(i+1,j,grid,n);
        found=found || dfs(i,j+1,grid,n);
        found=found || dfs(i,j-1,grid,n);
        return found;
    }
}
