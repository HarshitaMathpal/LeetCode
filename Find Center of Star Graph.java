class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        // ArrayList<ArrayList<Integer>> graph = constructGraph(n,edges);

        int[] indegree = new int[n+2];
        int[] outdegree = new int[n+2];

    
            for(int[] currvertex:edges){
                int a = currvertex[0];
                int b = currvertex[1];
                outdegree[b]++;
                outdegree[a]++;

                indegree[a]++;
                indegree[b]++;
            }
        

        for(int i=1;i<=n+1;i++){
            if(indegree[i]==n && outdegree[i]==n)
                return i;
        }

        return -1;
    }

    // public ArrayList<ArrayList<Integer>> constructGraph(int n,int[][] edges){

    //     ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    //     for(int i=0;i<n;i++){
    //         graph.add(new ArrayList<>());
    //     }

    //     for(int[] currvertex:edges){
    //         int a = currvertex[0];
    //         int b = currvertex[1];
    //         graph.get(a).add(b);
    //         graph.get(b).add(a);
    //     }

    //     return graph;
    // }
}
