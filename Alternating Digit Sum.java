class Solution {
    public int alternateDigitSum(int n) {
        String s = n+"";
        int sum = 0;
 
        for(int i=0;i<s.length();i++){
            int x = s.charAt(i) - '0';
            if(i%2!=0){
                x = -x;
            }
            sum += x; 
        }
        return sum;
    }
}
