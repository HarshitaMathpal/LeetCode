class Solution {
    public int commonFactors(int a, int b) {
     int c = 0;
        int x = 1;
        int i = Math.min(a,b);
        while(x<=i){
            if(a%x==0 && b%x==0){
                c++;
            }
            x++;
        }
        return c;
    }
}
