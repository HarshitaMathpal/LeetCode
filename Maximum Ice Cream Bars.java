class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int num = 0;
        for(int i=0;i<costs.length;i++){
            if(coins>=costs[i]){
                coins -= costs[i];
                num++;
            }
            else{
                break;
            }
        }
        return num;
    }
}
