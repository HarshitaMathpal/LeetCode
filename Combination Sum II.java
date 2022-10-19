class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        combinations(res,list,candidates,target,0,0);
        return res;
    }
    public void combinations(List<List<Integer>> res,List<Integer> list,int[] candidates,int target,int csum,int idx)
    {
        if(csum>target)return;
        if(csum==target)
        {
            // if(res.contains(list))return;
            res.add(new ArrayList<>(list));
        }
        for(int i=idx;i<candidates.length;i++)
        {
            if(i!=idx && candidates[i]==candidates[i-1])
                continue;
            
            list.add(candidates[i]);
            combinations(res,list,candidates,target,csum+candidates[i],i+1);
            list.remove(list.size()-1);
        }
    
    }
}
