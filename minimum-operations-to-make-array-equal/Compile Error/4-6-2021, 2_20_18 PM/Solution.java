// https://leetcode.com/problems/minimum-operations-to-make-array-equal

class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        
        int count =0;
        int tape = 0;
        for (int i =0; i<arr.length; i++){
            arr[i] = 2**i+1;
            count +=arr[i];
        }
        int avg = count/n;
        for (int i =0; i<arr.length/2; i++){
            tape = tape + count -arr[i];
            
        }
        return tape;
        
        
    }
}