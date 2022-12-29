class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='#'){
                if(!a.isEmpty())
                a.pop();
            }
            else
                a.push(c);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c=='#'){
                if(!b.isEmpty())
                    b.pop();
            }
            else
                b.push(c);
        }
        if(a.size() != b.size())
            return false;
        while(!a.isEmpty() && !b.isEmpty()){
            if(a.pop() != b.pop())
                return false;
        }
        return true;

    }
}
