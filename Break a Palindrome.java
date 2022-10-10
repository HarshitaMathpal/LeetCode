class Solution {
    public String breakPalindrome(String p) {
        int n = p.length();
        if(n==1)
            return "";
        char[] arr = p.toCharArray();
        boolean o = false;
        for (int i = 0; i < n/2; i++){
            if (arr[i] != 'a'){
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[n-1] = 'b';
        return String.valueOf(arr);
    }
}
