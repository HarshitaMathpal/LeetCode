class Solution {
    public boolean isThree(int n) {
        int c = 0;
        int x = 1;
        while(x<=n){
            if(n%x==0){
                c++;
            }
            x++;
        }
        if(c==3)
            return true;
        return false;
    }
}
