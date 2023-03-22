class Pair implements Comparable<Pair>{
    int vertex;
    int cost;
    
    Pair(int vertex,int cost){
        this.vertex = vertex;
        this.cost = cost;
    }
    
    public int compareTo(Pair p){
        return this.cost - p.cost;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int V, int S) {
        ArrayList<ArrayList<ArrayList<Integer>>> graph = constructGraph(times,V);
          // Write your code here
        int[] cost = new int[V+1];
        Arrays.fill(cost,-1);
        boolean[] vis = new boolean[V+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        pq.add(new Pair(S,0));
        
        while(!pq.isEmpty()){
            Pair currpair = pq.remove();
            int currvertex = currpair.vertex;
            int currcost = currpair.cost;
            
            if(vis[currvertex])
                continue;

            // if(cost[currvertex] != -1)
            // continue;
            
            cost[currvertex] = currcost;
            vis[currvertex] = true;
            
            ArrayList<ArrayList<Integer>> neighbour = graph.get(currvertex);
            for(ArrayList<Integer> current : neighbour){
                int currneighbour = current.get(0);
                int curredgecost = current.get(1);
                
                if(vis[currneighbour])
                    continue;

                pq.add(new Pair(currneighbour,curredgecost+currcost));
            }
        
        }
        
        int result = -1;
        for(int i=1;i<=V;i++){
            if(!vis[i])
                return -1;
        }
        for(int x:cost)
            result = Math.max(result,x);
        return result;
        
    }

    private ArrayList<ArrayList<ArrayList<Integer>>> constructGraph(int[][] times,int n){
        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<ArrayList<Integer>>());
        }

        for(int[] edge : times){
            int src = edge[0];
            int dest = edge[1];
            int time = edge[2];

            ArrayList<Integer> neigh = new ArrayList<>();

            neigh.add(dest);
            neigh.add(time);

            graph.get(src).add(neigh);
        }

        return graph;
    }
}
