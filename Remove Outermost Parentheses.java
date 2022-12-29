class Solution {
    public String removeOuterParentheses(String s) {
        int p = 0;
        String ans = "";
        int start = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                p++;
            }
            else
                p--;
            
            if(p==0){
                ans += s.substring(start+1,i);
                start = i+1;
            }
        }
        return ans;
    }
}
