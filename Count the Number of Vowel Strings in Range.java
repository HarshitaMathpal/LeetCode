class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
            String str = words[i];
            if(isVowel(str.charAt(0)) && isVowel(str.charAt(str.length()-1)))
                count++;
        }
        return count;
    }

    public boolean isVowel(char a){
        return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
    }
}
