class Solution {
    public int[] diStringMatch(String s) {
        int low = 0;
        int size = s.length();
        int high = size;
        char[] arr = s.toCharArray();
        int[] ans = new int[size+1];
        for(int i=0;i<size;i++){
            if(arr[i] == 'I'){
                ans[i] = low;
                low++;
            } 
            if(arr[i] == 'D'){
                ans[i] = high;
                high--;
            }
        }
        ans[size] = high;
        return ans;
        
    }
}
