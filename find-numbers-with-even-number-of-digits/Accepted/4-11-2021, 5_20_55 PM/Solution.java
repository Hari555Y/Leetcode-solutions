// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
        
        int sout =0;
        for (int i =0;  i<nums.length; i++){
            if (digits(nums[i])%2==0){
                sout++;
            }
        }
        return sout;
    }
    public int digits(int number){
        int count =0;
        while(number !=0){
            number =number/10;
            count++;
            
        }
        return count;
    }
}