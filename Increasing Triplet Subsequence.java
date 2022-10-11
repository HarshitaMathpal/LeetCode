class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <3){
            return false;
        }
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        
        for(int a:nums){
            if(a <= min){
                min = a;
            }
            else if(a>min && a<= secondmin){
                secondmin = a;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
