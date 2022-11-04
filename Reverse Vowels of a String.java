class Solution {
    public String reverseVowels(String s) {
        // String temp = s.toLowerCase(s);
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start<=end){
            if(isVowel(arr[start]) && isVowel(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(!isVowel(arr[start]) && !isVowel(arr[end])){
                start++;
                end--;
            }
            else if(isVowel(arr[start])){
                end --;
            }
            else{
                start++;  
            }
        }
        
        String ans = "";
        for(char a:arr){
            ans += a;
        }
        
        
        return ans;
    }
    
    public static boolean isVowel(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            return true;
        }
        return false;
    }
}
