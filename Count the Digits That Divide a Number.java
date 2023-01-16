class Solution {
    public int countDigits(int num) {
        int x = num;
        int count = 0;
        while(x>0){
            int y = x%10;
            if(num%y==0){
                count++;
            }
            x /= 10;
        }
        return count;
    }
}
