// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       // int[] myarr = new int[;
       // HashSet<Integer> has = new HashSet<>();
        int[] myarr = new int[matrix.length*matrix[0].length];
        int temp=0;
        for (int i =0; i<matrix.length;i++){
            for (int j =0; j<matrix[0].length;j++){
                myarr[temp] = matrix[i][j];
                temp++;
                
            }
        }
        
      //  int temp =0;
        Arrays.sort(myarr);
        return myarr[k-1];
        
    }
}