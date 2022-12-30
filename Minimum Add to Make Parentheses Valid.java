class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='('){
                st.push(a);
            }else{
                if(a == ')' && !st.isEmpty()){
                    st.pop();
                }else{
                    count++;
                }
            }
        }
        return st.size()+count;
    }
}
