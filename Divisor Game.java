class Solution {
    public boolean divisorGame(int n) {
        int count = 0;
        while(n>1){
            int x = 1;
            n -= x;
            count++;
        }
        if(count%2 != 0){
            return true;
        }
        return false;
    }
}
