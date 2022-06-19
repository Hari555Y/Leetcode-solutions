// https://leetcode.com/problems/check-array-formation-through-concatenation

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        ArrayList<Integer> ar = new Arraylist<>();
        for (int i =0; i<pieces.length; i++){
            for (int j =0 ; j< pieces[i].length; j++){
                ar.add(pieces[i][j]);
                
            }
            
        }
        for (int k =0; k<arr.length; k++){
            if (ar.contains(arr[k])){
                continue;
            }
            return false;
        }
        return true;
        
    }
}