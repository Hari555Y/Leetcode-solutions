// https://leetcode.com/problems/check-array-formation-through-concatenation

class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> ar = new HashMap<>();
        for (int i =0; i<pieces.length; i++){
            for (int j =0 ; j< pieces[i].length; j++){
                ar.put(pieces[i][j], j);
                
            }
            
        }
        for (int k =0; k<arr.length; k++){
            int r =-1;
            if (ar.containsKey(arr[k]) && ar.get(arr[k])>r){
                r = get(arr[k]);
                continue;
            }
            return false;
        }
        return true;
        
    }
}