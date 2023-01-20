class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        findsequence(nums,0,new ArrayList<Integer>(),ans,Integer.MIN_VALUE);
        List res = new ArrayList<>(ans);
        return res;
    }

    public void findsequence(int[] nums,int curr,ArrayList<Integer> al,Set<List<Integer>> ans,int prev){
        if(al.size()>1){
                ans.add(new ArrayList<>(al));
        }
        for(int i=curr;i<nums.length;i++){
            if(nums[i]>=prev){
                al.add(nums[i]);
                findsequence(nums,i+1,al,ans,nums[i]);
                al.remove(al.size()-1);
            }
        }
            
    }
}
