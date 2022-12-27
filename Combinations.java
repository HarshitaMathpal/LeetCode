class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        findcomb(n,k,1,new ArrayList<Integer>(), ans);
        return ans;
    }

    public void findcomb(int n,int k,int curr,List<Integer> temp,List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(curr>n)
            return;

        for(int i=curr;i<=n;i++){
            temp.add(i);
            findcomb(n,k-1,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
        return ;
    }
}
