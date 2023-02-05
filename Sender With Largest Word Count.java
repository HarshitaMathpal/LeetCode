class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=0;i<senders.length;i++){
            String[] arr = messages[i].split(" ");
            hm.put(senders[i],hm.getOrDefault(senders[i],0) + arr.length);
        }

        int maxv = Integer.MIN_VALUE;
        Arrays.sort(senders);

        String[] ans = {""};
        for(int i=0;i<senders.length;i++){
            if(maxv <= hm.get(senders[i])){
                maxv = hm.get(senders[i]);
                ans[0] = senders[i];
            }
        }

        return ans[0];
    }
}
