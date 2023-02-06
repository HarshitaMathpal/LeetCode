class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int j = 0;
        int k = n;
        int i=0;
        while(k<nums.length){
            if(j%2==0){                             // x1 x2 x3
                ans[j] = nums[i];
                i++;
            }
            else{
                ans[j] = nums[k];                  // y1 y2 y3
                k++;
            }
            j++;
        }
        return ans;
    }
}
