class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles){
            pq.add(i);
        }
        while(!pq.isEmpty() && k-->0){
            int num = pq.remove();
            num -= (int)Math.floor(num/2);
            pq.add(num);
        }
        int totalsum = 0;
        while(!pq.isEmpty()){
            totalsum += pq.remove();
        }
        return totalsum;
    }
}
