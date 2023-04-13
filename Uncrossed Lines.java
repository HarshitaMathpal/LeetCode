class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }

        return common(nums1,nums2,0,0,dp);
    }

    public static int common(int[]nums1,int[]nums2,int indx1,int indx2,int[][] dp){
        if(indx1 >= nums1.length || indx2 >= nums2.length){
            return 0;
        }

        if(dp[indx1][indx2] != -1){
            return dp[indx1][indx2];
        }

        int take = 0,notake = 0;

        if(nums1[indx1] == nums2[indx2]){
            take = 1 + common(nums1,nums2,indx1+1,indx2+1,dp);
        }
        else{
            notake = Math.max(common(nums1,nums2,indx1,indx2+1,dp),common(nums1,nums2,indx1+1,indx2,dp));
        }

        return dp[indx1][indx2] = Math.max(take,notake);
    }
}
