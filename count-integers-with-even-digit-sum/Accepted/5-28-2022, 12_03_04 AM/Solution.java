// https://leetcode.com/problems/count-integers-with-even-digit-sum

class Solution {
    public int countEven(int num) {
        int count  =0;
       // int tep = num;
        for(int i =1; i<=num ; i++){
            int sum=0;
            int tep = i;
            while(tep >0){
                sum += tep%10;
                 tep /= 10;
            }
            if (sum %2==0){
                count++;     
            } 
            
        }
        return count;
        
    }
}