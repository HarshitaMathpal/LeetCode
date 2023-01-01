class Solution 
{ 
    String transform(String S) 
    {
        // code here
       S = S.toLowerCase();

 StringBuilder res = new StringBuilder();

        int c = 1,i=0,j = 1;

        while(j<S.length()){
            if(S.charAt(i)==S.charAt(j)){
                j++;
                c++;
            }
            else{
                res.append(c+""+S.charAt(i));
                i=j;
                j=j+1; 
                c=1;
            }
        }

        res.append(c+""+S.charAt(S.length()-1));

        return res.toString();
        
    }
} 
