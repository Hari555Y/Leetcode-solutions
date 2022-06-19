// https://leetcode.com/problems/maximum-number-of-balls-in-a-box

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int max = 0;
        for (int i =lowLimit;i <=highLimit; i++){
            int number = i; int sum  =0;
            while(number>0){
                sum = sum + number%10;
                number = number/10;
            }
            max = Math.max(max, ++arr[sum]);
            
        }
        return max;
        
        
        
    }
}