class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum = 0;
        int digitsum = 0;
        for(int i=0;i<nums.length;i++){
            elesum += nums[i];
            String num = Integer.toString(nums[i]);
            for (int j = 0; j < num.length(); j++) {
                digitsum += num.charAt(j) - '0';
            }
        }
        
        return Math.abs(digitsum - elesum);
    }
}
