class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        for(int i=0;i<gain.length;i++){
            altitude[i+1] = altitude[i]+gain[i];
        }
        int maxv = 0;
        for(int i:altitude){
            maxv = Math.max(maxv,i);
        }
        return maxv;
    }
}
