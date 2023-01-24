class Solution {
    public int[] replaceElements(int[] arr) {
        // int greater = -1;
        // int ans[] = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     greater = -1;
        //     for(int j=i+1;j<arr.length;j++){
        //         greater = Math.max(arr[j],greater);
        //     }
        //     ans[i] = greater; 
        // }
        // return ans;

          
        int max = -1; 
    
        for (int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max; 
            max = Math.max(max, temp);
        }
        return arr;

    }
}
