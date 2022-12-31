class Solution {
    public static String removePair(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(st.isEmpty())
                st.push(ch);
            else{
                if(st.peek() == ch ){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
        }
         return ans.equals("") ? "Empty String" :ans;
    }
}
