class Solution {
    public int distributeCandies(int[] candyType) {
        int eat = candyType.length/2;
        HashSet<Integer> sh = new HashSet<>();
        for(int i:candyType){
            sh.add(i);
        }
        if(eat<=sh.size()){
            return eat;
        }
        else{
            return sh.size();
        }
    }
}
