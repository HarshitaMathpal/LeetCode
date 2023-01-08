class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer>memo=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            memo.put(nums[i],memo.getOrDefault(nums[i],0)+1); //checking nums[i] bcoz if a-b=k than a-k=b wich means if in out nums no,is present than  it give absolute difference of k;
        }
        for(int i = 0; i <nums.length ; i++) {
            if(memo.containsKey(nums[i]-k))
                ans+=memo.get(Math.abs(nums[i]-k));
        }
    
        return ans;
    }
}
