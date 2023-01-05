class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        

        int prev = 0;
        int c = 1;
        for(int current = 1;current<n;current++){
            if(points[current][0] > points[prev][1]) {
                c++;
                prev = current;
            } 
        }
        return c;

          

    }
}
