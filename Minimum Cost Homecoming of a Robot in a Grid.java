class Solution {
    public int minCost(int[] start, int[] home, int[] row, int[] col) {
        int ansrow =0,anscol=0;
        if(start[0]<home[0]){
            for(int i=start[0]+1;i<=home[0];i++){
                ansrow += row[i];
            }
        }
        else if(start[0]>home[0]){
            for(int i=start[0]-1;i>=home[0];i--){
                ansrow += row[i];
            }
        }
        if(start[1]<home[1]){
            for(int i=start[1]+1;i<=home[1];i++){
                anscol += col[i];
            }
        }
        else if(start[1]>home[1]){
            for(int i=start[1]-1;i>=home[1];i--){
                anscol += col[i];
            }
        }
        return ansrow+anscol;
    }
}
