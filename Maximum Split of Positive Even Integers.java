class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum % 2 != 0){
            return new ArrayList<Long>();
        }
        List<Long> ans= new ArrayList<>();
        long x = 2;
        long remainsum = finalSum;
        while(x <= remainsum){
            remainsum -= x;
            ans.add(x);
            x += 2;
        }
        long last = ans.remove(ans.size()-1);
        ans.add(remainsum + last);
        return ans;
    }
}
