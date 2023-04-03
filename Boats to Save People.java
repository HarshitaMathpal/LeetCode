class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatcount = 0;
        int left = 0;
        int right = people.length-1;

        while(left<=right){
            int sum = people[left]+people[right];
            if(sum<=limit){
                boatcount++;
                left++;
                right--;
            }
            else{
                boatcount++;
                right--;
            }
        }

        return boatcount;
        
    }
}
