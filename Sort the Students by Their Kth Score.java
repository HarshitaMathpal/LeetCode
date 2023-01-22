class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        sortbyScore(score, k);
        return score;
        
    }
    public static void sortbyScore(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() {
            
          @Override              
          public int compare(final int[] entry1, 
                             final int[] entry2) {
  
            if (entry1[col] < entry2[col])
                return 1;
            else
                return -1;
          }
        }); 
    }
}
