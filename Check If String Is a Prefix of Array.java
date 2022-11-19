class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String temp = "";
        for(int i=0;i<words.length;i++){
            temp += words[i];
            if(temp.equals(s)){
                return true;
            }
        }
        return false;
    }
}
