class Solution {
    public boolean checkValidString(String s) {
        int open =0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else {
                open--;
            }
            if(ch!=')'){
                close++;
            }
            else{
                close--;
            }
            if (close<0)
            break;
            open=Math.max(open,0);
        }
        
        return open == 0;
    }
}
