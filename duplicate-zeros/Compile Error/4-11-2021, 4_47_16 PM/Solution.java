// https://leetcode.com/problems/duplicate-zeros

class Solution {
    public void duplicateZeros(int[] arr) {
        int count =1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] ==0){
                int count = i;
                arr[count+1]=0;
            }
            
        }
        
    }
}