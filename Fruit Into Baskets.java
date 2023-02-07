class Solution {
    public int totalFruit(int[] nums) {
        int ans=0;
        int distinct=0;
        int release =0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int acquire=0;acquire<nums.length;acquire++){
            int curr=nums[acquire];
            
            if (hm.containsKey(curr)){
                hm.put(curr,hm.get(curr)+1);
            }
            else{
                hm.put(curr,1);
                distinct+=1;
            }

            while(acquire>release && distinct>2){
                int discard=nums[release];
                release+=1;
                
                hm.put(discard,hm.get(discard)-1);

                if(hm.get(discard)==0){
                    hm.remove(discard);
                    distinct-=1;
                }
            }
            ans=Math.max(ans,acquire-release+1);
        }
        return ans;
    }
}
