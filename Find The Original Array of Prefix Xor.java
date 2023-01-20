class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];

        ans[0] = pref [0];
        for(int i=n-1;i>0;i--){
            ans[i] = pref[i] ^ pref[i-1];
        }
        return ans;
    }
}
