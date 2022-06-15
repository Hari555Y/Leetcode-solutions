// https://leetcode.com/problems/duplicate-zeros

class Solution {
    public void duplicateZeros(int[] arr) {
        int count =1;
        for (int i=1; i<arr.length; i++){
            if (arr[i-1] ==0){
                arr[count++]=0;
            }
            count++;
        }
        
    }
}