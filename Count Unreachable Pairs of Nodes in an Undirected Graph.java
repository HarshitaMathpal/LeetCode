class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            al.get(u).add(v);
            al.get(v).add(u);
        } 
        long sum=0;;
        long ans=0;
        boolean[]visited=new boolean[n];
        for(int currentvertex=0;currentvertex<n;currentvertex++){
            if(!visited[currentvertex]){
                int visitcount=bfs(visited,currentvertex,al,n);
                // System.out.println(visitcount);
                ans += sum*visitcount;
                sum += visitcount;
            }
            
        }

        return ans;
    }

    private int bfs(boolean[]visited,int currentvertex,List<List<Integer>> al,int n){

        visited[currentvertex]=true;
        Queue<Integer> qu=new LinkedList<>();
        qu.add(currentvertex);
        int count = 1;
        while(!qu.isEmpty()){
            int curr=qu.poll();
            for(int adjnode:al.get(curr)){
                if(!visited[adjnode]){
                    qu.add(adjnode);
                    count ++;
                    visited[adjnode]=true;
                }
            }
        }
        return count;
        
    }
}
