class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(rooms,0,vis);

        for(int i=0;i<vis.length;i++){
            if(!vis[i])
                return false;
        }
        return true;
    }

    public static void dfs(List<List<Integer>> rooms,int currvertex,boolean[] vis){
        if(vis[currvertex])
            return;

        vis[currvertex] = true;
        
        for(int currneighbour : rooms.get(currvertex)){
            if(!vis[currneighbour])
                dfs(rooms,currneighbour,vis);
        }
    }
}
