class Solution {
    static int count;
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int srow = -1;
        int scol = -1;
        int zero = 0;
        count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    srow = i;
                    scol = j;
                }
                if(grid[i][j] == 0)
                    ++zero;
            }
        }
        ways(grid,srow+1,scol,m,n,zero);
        ways(grid,srow-1,scol,m,n,zero);
        ways(grid,srow,scol+1,m,n,zero);
        ways(grid,srow,scol-1,m,n,zero);

        return count;
    }
    public void ways(int[][] grid,int currrow,int currcol,int m,int n,int zero){
        if(currrow<0 || currcol<0 || currrow>=m || currcol>=n || grid[currrow][currcol] == -1 || grid[currrow][currcol] == 3 || grid[currrow][currcol] == 1){
            return ;
        }
        if(grid[currrow][currcol] == 2){
            if(zero==0)
            count++;

            return ;
        }
        if(grid[currrow][currcol] == 0){
            --zero;
        }
        
            grid[currrow][currcol] = 3;
            ways(grid,currrow+1,currcol,m,n,zero);
            ways(grid,currrow,currcol+1,m,n,zero);
            ways(grid,currrow-1,currcol,m,n,zero);
            ways(grid,currrow,currcol-1,m,n,zero);
            grid[currrow][currcol] = 0;

        return ;
        
    }
}
