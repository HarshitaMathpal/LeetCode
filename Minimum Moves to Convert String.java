class Solution {
    public int minimumMoves(String s) {
        char[] arr = s.toCharArray();
        int move = 0;
        for(int i=0;i<s.length()-2;i++){
            if(arr[i] == 'X'){
                move++;
                arr[i] = '0';
                arr[i+1] = '0';
                arr[i+2] = '0';
            }
        }
        if(arr[s.length()-2]=='X' || arr[s.length()-1]=='X'){
            move++;
        }
        return move;
    }
}
