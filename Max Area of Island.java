class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int answer=0;
        int m=grid.length;
        int n=grid[0].length;

        for(int currentRow=0;currentRow<m;currentRow++){
            for(int currentCol=0;currentCol<n;currentCol++){
                if(grid[currentRow][currentCol]==1){
                    //answer+=1;
                    answer=Math.max(answer,findsinkisland(grid,currentRow,currentCol,m,n));
                }
            }
        }

        return answer;
    }

    public static int findsinkisland(int[][] grid,int currentRow,int currentCol,int m,int n){
        if(currentRow<0 || currentRow>=m || currentCol<0 || currentCol>=n || grid[currentRow][currentCol]==0){
            return 0;
        }

        grid[currentRow][currentCol]=0;

        int up=findsinkisland(grid,currentRow-1,currentCol,m,n);// Up call

        int down=findsinkisland(grid,currentRow+1,currentCol,m,n);// down call

        int left=findsinkisland(grid,currentRow,currentCol-1,m,n);// left call

        int right=findsinkisland(grid,currentRow,currentCol+1,m,n);// right call

        return (1+up+down+left+right);

    }
}
