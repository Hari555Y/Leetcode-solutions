// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

class Solution {
    public int numberOfSteps(int num) {
        int step =0;
        while(num>0){
            if (num%2==0){
                step++;
                num/=2;
            }
            else{
                step++;
                num-=1;
            }
        }
        return step;
        
    }
}