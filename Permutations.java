class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        generate(nums,0,new ArrayList<>(),ans,freq);
        return ans;
    }
    
    public void generate(int[] nums,int currindx,List<Integer> temp,List<List<Integer>> ans,boolean[] freq){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                temp.add(nums[i]);
                generate(nums,i,temp,ans,freq);
                temp.remove(temp.size()-1);
                freq[i] = false;
            }
        }
        return;
    }
}
