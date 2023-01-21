class Solution {
    public boolean isReachable(int x, int y) {
        while(x%2==0)
            x /= 2;
        while(y%2==0)
            y /= 2;
        while(x>0 && y>0){
            if(y>x)
                y -= x;
            else if(x>y)
                x -= y;
            else if (x==1 && y==1)
                return true;
            else 
                return false;
        }
        return false;
    }
}
