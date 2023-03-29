class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] indegree = new int[n];
        for(int i=0;i<n;i++){
            if(edges[i] != -1){
                indegree[edges[i]]++;
            }
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> que = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }

        while(!que.isEmpty()){
            int currvertex = que.remove();
            visited[currvertex] = true;

            int currneighbour = edges[currvertex];
            if(currneighbour != -1){
                indegree[currneighbour]--;
                if(indegree[currneighbour]==0){
                    que.add(currneighbour);
                }
            }
        }
        int ans = -1;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                int count = 1;
                int currneighbour = edges[i];
                visited[i] = true;
                while(currneighbour!=i){
                    visited[currneighbour] = true;
                    count++;
                    currneighbour = edges[currneighbour];
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}
