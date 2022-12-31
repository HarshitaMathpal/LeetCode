class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        Stack<String> st = new Stack<>();
        String num = "";
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(Character.isDigit(ch)){
                num += ch;
            }
            else{
                st.push(num);
                st.push(Character.toString(ch));
                num = "";
            }
        }
        st.push(num);
        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}
