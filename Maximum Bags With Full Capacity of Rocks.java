class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int add) {
        int[] diff = new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int count = 0;
        for(int i=0;i<diff.length;i++){
            if(add>=diff[i]){
                add -= diff[i];
                count++;
            }
        }
        return count;
    }
}
