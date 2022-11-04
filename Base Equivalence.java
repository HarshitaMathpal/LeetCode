class Solution
{
    String baseEquiv(int n, int m)
    {
        // code here
        int i = 2;
        while(i<=32){
        int len = count(n,i);
        if(len == m)
        return "Yes";
        i++;
        }
        return "No";
        
    }

    

    int count(int n,int base){
        int count = 0;
        while(n!=0){
            count++;
            n = n/base;
        }
        return count;
    }
}
