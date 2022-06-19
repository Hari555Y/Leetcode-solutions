// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count =0;
        for (int i =left; i<=right; i++){
            if(isprime(Integer.bitCount(i)))
                count++;
        }
        return count;
    }
    public static boolean isprime(int a){
       // boolean bool = false;
        for (int i =1; i<a; i++){
            if (a%i==0){
                return true;
            }
            
        }
        return false;
    }
}