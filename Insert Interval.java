class Solution {
    public int[][] insert(int[][] i, int[] ni) {
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] a:i){
            if(ni[0]>a[1]){
                // min = Math.min(i[0],ni[0]);
                // max = Math.max(i[1],ni[1]);
                ans.add(a);
            }
            else if(ni[1]<a[0]){
                ans.add(ni);
                ni = a;
            }
            else{
                ni[0] = Math.min(ni[0],a[0]);
                ni[1] = Math.max(ni[1],a[1]);
            }
        }
        ans.add(ni);

        return ans.toArray(new int[ans.size()][]);
    }
}
