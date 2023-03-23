class Solution {
    public int makeConnected(int n, int[][] grid) {
        if(grid.length  < n-1)
            return -1;
        ArrayList<ArrayList<Integer>> graph = constructGraph(n,grid);
        boolean[] vis = new boolean[n];

        int connected = 0;
        for(int currvertex=0;currvertex<n;currvertex++){
            if(!vis[currvertex]){
                dfs(graph,vis,currvertex);
                connected++;
            }
        }
        
        return connected-1;
    }

    public  ArrayList<ArrayList<Integer>> constructGraph(int n,int[][] grid){
         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

         for(int i=0;i<n;i++){
             graph.add(new ArrayList<>());
         }

         for(int[] curredge:grid){
             int a = curredge[0];
             int b = curredge[1];
             graph.get(a).add(b);
             graph.get(b).add(a);
         }

         return graph;
    }

    public void dfs(ArrayList<ArrayList<Integer>> graph,boolean[]vis,int currvertex){
        if(vis[currvertex])
            return;
        
        vis[currvertex] = true;

        for(int currneighbour : graph.get(currvertex)){
            if(!vis[currneighbour]){
                dfs(graph,vis,currneighbour);
            }
        }
    }
}
