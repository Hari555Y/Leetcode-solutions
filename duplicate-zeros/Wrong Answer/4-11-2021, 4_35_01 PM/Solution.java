// https://leetcode.com/problems/duplicate-zeros

class Solution {
    public void duplicateZeros(int[] arr) {
        int count =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] ==0){
                arr[count++] =0;
                arr[count++]=0;
            }
        }
        
    }
}