// https://leetcode.com/problems/fibonacci-number

class Solution {
    public int fib(int n) {
        if (n<=1){
            return n;
        }
        int first =0; int second =1;
       // else{
         //   return fib(n-1) + fib(n-2);
        //}
        int sum =0;
        for (int i =2; i<=n; i++){
            sum = first +second;
            first = second;
            second = sum;
        }
        return sum;
        
    }
}