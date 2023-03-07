class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean found = false;
        while(true){
            found = false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==original){
                    original *= 2;
                    found = true;
                }
                
            }
            if(!found){
                    break;
                }
        }
        return original;
    }
}
