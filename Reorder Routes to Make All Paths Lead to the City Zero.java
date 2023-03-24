class Edge{
    int vertex;
    int cost;
    Edge(int vertex,int cost){
        this.vertex = vertex;
        this.cost = cost;
    }
}

class Solution {
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<Edge>> graph = constructGraph(n,connections);
        boolean[] vis = new boolean[n];

        // Run a dfs from 0 and dissolve(mark) the edges that can be reached from zero, thereby increasing the count
        // Because if an edge is directly reachable from 0, it actually needs to get reversed
        return dfs(graph,0,vis);
    }

    public ArrayList<ArrayList<Edge>> constructGraph(int n, int[][] connections){
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<connections.length;i++){
             // 1 denotes original edge
            graph.get(connections[i][0]).add(new Edge(connections[i][1],1));
            // 0 denotes reversed edge
            graph.get(connections[i][1]).add(new Edge(connections[i][0],0));
        }

        return graph;
    }

        public int dfs(ArrayList<ArrayList<Edge>> graph,int source,boolean[] vis){
            vis[source] = true;

            int cost = 0;

            for(Edge currneighbour : graph.get(source)){
                if(!vis[currneighbour.vertex]){
                    cost += currneighbour.cost + dfs(graph,currneighbour.vertex,vis);
                }
            }

            return cost;
        }
    
}
