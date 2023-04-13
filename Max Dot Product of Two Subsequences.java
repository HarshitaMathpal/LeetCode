class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int[][]dp=new int[nums1.length+1][nums2.length+1];
        for(int[]a:dp){
            Arrays.fill(a,Integer.MIN_VALUE);
        }
        return Product(nums1,nums2,0,0,true,dp);
    }

    private static int Product(int[] nums1,int []nums2,int i,int j,boolean flag,int[][]dp){
        if(i==nums1.length || j==nums2.length){
            if(flag){
                return 0;
            }
            else{
                return -1000000;
            }
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int dot=nums1[i]*nums2[j]+Product(nums1,nums2,i+1,j+1,true,dp);
        int fd=Product(nums1,nums2,i+1,j,false,dp);
        int sd=Product(nums1,nums2,i,j+1,false,dp);
        return dp[i][j]=Math.max(nums1[i]*nums2[j],Math.max(fd,Math.max(dot,sd)));
    }
}
