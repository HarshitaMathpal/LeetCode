class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
         HashMap<Integer,Integer>memo=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            memo.put(nums[i],i);
        }

        for(int[]arr:operations){
            int index=memo.get(arr[0]);
            nums[index]=arr[1];
            memo.remove(arr[0]);
            memo.put(arr[1],index);
        }
        return nums;
    }
}
