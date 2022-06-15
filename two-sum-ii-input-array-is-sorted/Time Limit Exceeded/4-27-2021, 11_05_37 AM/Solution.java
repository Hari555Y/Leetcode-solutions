// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i =0; int j = numbers.length-1;
        int[] arr = new int[2];
        while(i<j){
            if (numbers[i] +numbers[j] ==target){
                arr[0] =i+1;
                arr[1] =j+1;
                
            }
            if (numbers[i] + numbers[j]>target){
                j--;
            }
            if (numbers[i] + numbers[j]<target){
                i++;
            }
        /*    else{
             //   int[] arr = new int[2];
                arr[0] =i+1;
                arr[1] =j+1;
              //  return arr;
                
            }*/
            
        }
        return arr;
    }
}