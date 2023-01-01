class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n-2][n-2];

        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                res[i][j] = findMax(i,j,grid);
            }
        }
        return res;
    }

    public int findMax(int i,int j,int[][] grid){
        int maxval = Integer.MIN_VALUE;
        for(int a=i;a<=i+2;a++){
            for(int b=j;b<=j+2;b++){
                maxval = Math.max(grid[a][b],maxval);
            }
        }
        return maxval;
    }
}
