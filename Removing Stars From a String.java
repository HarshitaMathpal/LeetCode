class Solution {
    public String removeStars(String s) {
       List<Character> res = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                res.add(c);
            } else if (!res.isEmpty()) {
                res.remove(res.size() - 1);
            }
        }
        String temp = "";
        for(int i=0;i<res.size();i++){
            temp += res.get(i);
        }

        return temp;
    }
}
