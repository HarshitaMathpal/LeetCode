class Pair{
    int vertex;
    int cost;
    Pair(int vertex,int cost){
        this.vertex = vertex;
        this.cost = cost;
    }

    // public int compareTo(Pair p){
    //     return this.cost - p.cost;
    // }
}

class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> al = new ArrayList<>();
        boolean[] vis = new boolean[n+1];

        for(int i=0;i<=n+1;i++){
            al.add(new ArrayList<>());
        }

        for(int i=0;i<roads.length;i++){
            al.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            al.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
        }

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(1,Integer.MAX_VALUE));
        int ans = Integer.MAX_VALUE;

        while(!que.isEmpty()){
            Pair currpair = que.remove();
            int currvertex = currpair.vertex;
            int currcost = currpair.cost;

            vis[currvertex] = true;

            ans = Math.min(ans,currcost);

            for(Pair currneighbour : al.get(currvertex)){
                if(!vis[currneighbour.vertex]){
                    que.add(currneighbour);
                }
            }
        }

        return ans;
    }
}
