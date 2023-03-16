class Solution {
    public int passThePillow(int n, int time) {
        int timeOfOnePass = n-1;
        int totalpass = time/timeOfOnePass;
        int rem = time%timeOfOnePass;
        return (totalpass%2==0)?rem+1:n-rem;
    }
}
