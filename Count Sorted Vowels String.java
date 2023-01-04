class Solution {
    public int countVowelStrings(int n) {
        return count(n,0);
    }

    public int count(int n,int indx){
        if(n==0)
            return 1;

        int ans = 0;
        for(int i=indx;i<5;i++){
            ans += count(n-1,i);
        }

        return ans;
    }
}
