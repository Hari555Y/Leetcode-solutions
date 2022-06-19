// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       // int[] myarr = new int[;
        HashSet<Integer> has = new HashSet<>();
        for (int i =0; i<matrix.length;i++){
            for (int j =0; j<matrix[0].length;j++){
                has.add(matrix[i][j]);
                
            }
        }
        int[] myarr = new int[has.size()];
        int temp =0;
        for (int i:has){
            myarr[temp] =i;
            temp++;
        }
        Arrays.sort(myarr);
        return myarr[k-1];
        
    }
}