class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public void subsets(int[] nums,int currindx,List<Integer> temp,List<List<Integer>> ans){
        if(currindx==nums.length){
            if(!ans.contains(new ArrayList<>(temp))){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        
        temp.add(nums[currindx]);
        subsets(nums,currindx+1,temp,ans);                               //take
        
        temp.remove(temp.size()-1);                                      //backtrack
        subsets(nums,currindx+1,temp,ans);                               //not take
        
        
        return;
    }
}
