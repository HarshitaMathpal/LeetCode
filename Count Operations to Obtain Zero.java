class Solution {
    public int countOperations(int num1, int num2) {
        int ope = 0;
        while(num1!=0 && num2!=0){
            if(num1>num2){
                num1 = num1-num2;
                ope++;
            }
            if(num2>num1){
                num2 = num2-num1;
                ope++;
            }
            if(num1==num2){
                return ope+1;
            }
        }
        return ope;
    }
}
