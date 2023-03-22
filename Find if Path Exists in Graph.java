class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>graph = Constructgraph(edges,n);
        boolean[] vis = new boolean[n];

        return pathExist(graph,source,destination,vis);
    }

    public boolean pathExist(ArrayList<ArrayList<Integer>>graph,int src,int dest,boolean[] vis){
        if(vis[src])
            return false;
        
        if(src==dest)
            return true;
        
        vis[src] = true;

        for(int currneighbour : graph.get(src)){
            if(pathExist(graph,currneighbour,dest,vis))
                return true;
        }
        return false;
    }

    private ArrayList<ArrayList<Integer>> Constructgraph(int[][]edges,int n){
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int currentEdges[]:edges){
            int a=currentEdges[0];
            int b=currentEdges[1];
            graph.get(b).add(a);
            graph.get(a).add(b);
        }

        return graph;
    }
    
}
