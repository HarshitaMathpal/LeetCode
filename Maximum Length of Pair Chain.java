class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1;
        int firstpart = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(firstpart < pairs[i][0]){
                chainlen++;
                firstpart = pairs[i][1];
            }
        }
        return chainlen;
    }
}
