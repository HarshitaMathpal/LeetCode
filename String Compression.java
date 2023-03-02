class Solution {
    public int compress(char[] chars) {
        String s = chars[0]+"";
        int c = 1;
        for(int i = 1 ; i < chars.length ;i++){
            char curr = chars[i];
            char prev = chars[i-1];
            if(curr == prev){
                c++;
            }else{
                if(c>1){
                    s+=c;
                    c=1;
                }
                s+=curr;
            }
        }
        if(c>1){
            s+=c;
            c=1;
        }
        for(int i = 0 ; i < s.length() ; i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}
