class Solution {
    public boolean checkIfPangram(String s) {
        int[] check = new int[26];
        for(int i=0;i<s.length();i++){
            check[s.charAt(i)-'a']++;
        }
        for(int i=0;i<check.length;i++){
            if(check[i] == 0){
                return false;
            }
        }
        return true;
    }
}
