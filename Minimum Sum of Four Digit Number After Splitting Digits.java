class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = num%10;
            num /= 10;
        }
        Arrays.sort(arr);
        int x = 0, y = 0;
        int k = 0;
        // for(int i=0;i<2;i+=2){
        //     int j = i+2;
        //     x += arr[i] * Math.pow(10,k);
        //     k++;
        //     y += arr[j] * Math.pow(10,k);
        //     k++;
        // }
        x = arr[0] * 10 + arr[2];
        y = arr[1] * 10 + arr[3];
        return x + y;
    }
}
