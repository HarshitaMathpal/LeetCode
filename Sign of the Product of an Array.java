class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int i:nums){
            if(i==0)
                return 0;
            sign *= i >0 ? 1:-1   ;     
        }
        return sign;
    }
}
