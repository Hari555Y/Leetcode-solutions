// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length ==1){
            return true;
        }
        int diff = arr[1]-arr[0];
        int  n = arr.length;
        for(int i =1; i<n ; i++){
            if(diff != arr[i]-arr[i-1]){
                return false;
            }
            
        }
        return true;
        
    }
}