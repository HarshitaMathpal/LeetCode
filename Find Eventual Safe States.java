class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int currvertex=0;currvertex<graph.length;currvertex++){
            boolean[] vis = new boolean[graph.length];
            boolean[] stack = new boolean[graph.length];
            if(!vis[currvertex] && hasCycle(graph,currvertex,vis,stack)){
                //has cycle do nothing
            }
            else{
                ans.add(currvertex);
            }
                
        }
        return ans;
    }

    // public boolean dfs(int currvertex,int[][] graph,boolean[] vis){
    //     vis[currvertex] = true;
    //     for(int currneighbour : graph[currvertex]){
    //         if(!vis[currneighbour]){
    //             if(dfs(currneighbour,graph,vis))
    //                 return true;
    //         }
    //         else if(vis[currneighbour]==vis[currvertex])
    //             return true;
    //     }
    //     vis[currvertex] = false;

    //     return false;
    // }

    public boolean hasCycle(int[][] graph,int currvertex,boolean[] vis,boolean[] stack){
        vis[currvertex] = true;
        stack[currvertex] = true;
        
        int[] neighbours = graph[currvertex];
        
        for(int currneighbour : neighbours){
            if(vis[currneighbour]==false && hasCycle(graph,currneighbour,vis,stack))
                return true;
            else if(stack[currneighbour])
                return true;
        }
        
        stack[currvertex] = false;
        return false;
    }
}
