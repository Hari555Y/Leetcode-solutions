// https://leetcode.com/problems/duplicate-zeros

class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        for(int i=0;i<length;i++){
            if(arr[i] == 0){
                for(int j = length-1; j>i;j--){
                    arr[j] = arr[j-1];
                }
                arr[i++] = 0;
            }
        }	
        
    }
}